var stompClient = null;

var vm = new Vue({
	el: '#main-content',
	data {
	    notification: ""
	}
})

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#replies").html("");
}

// When connecting, subscribe to a topic to receive
// messages sent from the server.
function connect() {
    var socket = new SockJS('/PilotPayroll-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/TestControl', function (reply) {
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
}

function sendUpdatesSent() {
    stompClient.send("/app/UpdatesSent", {}, 
      JSON.stringify({'department': $("#department").val()}));
}

function sendSubmitToFinance() {
    stompClient.send("/app/SubmitToFinance", {}, 
      JSON.stringify({'department': $("#department").val()}));
}

// Display a message received from the server.
function showReply(message) {
    $("#replies").append("<tr><td>" + message + "</td></tr>");
    var messageName = JSON.parse( reply.body ).messageName;
    if ( messageName == "Notification" ) {
        vm.notification = JSON.parse( reply.body ).Message;
        if ( JSON.parse( reply.body ).Code == "UC05_b" ) {
            $("#payroll").prop("disabled", False);

    } else if ( messageName == "PayrollSent" ) {
           $("#update").prop("disabled", False);
}

// Map buttons to functions.
$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#payroll" ).click(function() { sendRetrievePayrollForReview(); });
    $( "#update" ).click(function() { sendUpdatesSent(); });
    $( "#approve" ).click(function() { sendSubmitPayrollApproval(); });
    $( "#submit" ).click(function() { sendSubmitToFinance(); });
});