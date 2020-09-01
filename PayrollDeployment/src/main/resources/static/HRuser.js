var stompClient = null;

var vm = new Vue({
	el: '#main-content',
	data {
	    PayrollRequestDisabled: true,
	    UpdateDisabled: true,
	    ApproveDisabled: true,
	    SubmitDisabled: true,
	    notification: ""
	}
})

function initialize() {
	    vm.PayrollRequestDisabled = true;
	    vcm.UpdateDisabled = true;
	    vm.ApproveDisabled: true,
	    SubmitDisabled: true,
	    notification = "";
}


function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
        $("#payrollentries").hide();
    }
    else {
        $("#conversation").hide();
        initialize();
    }
    $("#replies").html("");
    $("#entries").html("");
}

// When connecting, subscribe to a topic to receive
// messages sent from the server.
function connect() {
    var socket = new SockJS('/PilotPayroll-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/HRuser/', function (reply) {
            showReply(JSON.parse(reply.body).content);
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

// Client-to-server messages.

function sendRetrievePayrollForReview() {
    stompClient.send("/app/RetrievePayrollForReview", {}, 
      JSON.stringify({'department': $("#department").val()}));
}

function sendSubmitPayrollApproval() {
    stompClient.send("/app/SubmitPayrollForApproval", {}, 
      JSON.stringify({'department': $("#department").val()}));
      vm.ApproveDisabled = true;
      vm.SubmitDisabled = false;
      $("#payrollentries").hide();
}

function sendUpdates() {
    // send a SubmitItemHold message for any changed hold status
    // then indicate all updates sent
    stompClient.send("/app/UpdatesSent", {}, 
      JSON.stringify({'department': $("#department").val()}));
}

function sendSubmitToFinance() {
    stompClient.send("/app/SubmitToFinance", {}, 
      JSON.stringify({'department': $("#department").val()}));
      vm.SubmitDisabled = true;
}

// Support functions for incoming message handling

function payrollDataMsg( message ) {
    // accept a payroll element data message - just display it, for now
    $("#entries").append("<tr><td>" + message + "</td></tr>");
}

// Display a message received from the server.

function showReply(message) {
    $("#replies").append("<tr><td>" + message + "</td></tr>");
    var messageName = JSON.parse( reply.body ).messageName;
    if ( messageName == "Notification" ) {
        vm.notification = JSON.parse( reply.body ).Message;
        if ( JSON.parse( reply.body ).Code == "UC05_b" ) {
           vm.PayrollDisabled = false;
    } else if ( messageName == "PayrollData" ) {
           vm.PayrollDisabled = true;
           payrollDataMsg( message );
    } else if ( messageName == "PayrollSent" ) {
           vm.UpdateDisabled = false;
           vm.ApproveDisabled = false;
        $("#payrollentries").show();
}

// Map buttons to functions.
$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#payroll" ).click(function() { sendRetrievePayrollForReview(); });
    $( "#update" ).click(function() { sendUpdates(); });
    $( "#approve" ).click(function() { sendSubmitPayrollApproval(); });
    $( "#submit" ).click(function() { sendSubmitToFinance(); });
});