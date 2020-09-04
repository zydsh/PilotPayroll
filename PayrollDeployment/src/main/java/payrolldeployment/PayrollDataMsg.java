package payrolldeployment;

//Spring requires a POJ class for each message.
public class PayrollDataMsg {
	private String messageName;
	private String employeeId;
	private String paymentLabel;
	private String paymentAmount;
	private String holdStatus;
	public PayrollDataMsg() {
	}
	public PayrollDataMsg( String messageName,
			               String employeeId,
                           String paymentLabel, 
                           String paymentAmount,
                           String holdStatus ) {
		this.messageName = messageName;
		this.employeeId = employeeId;
		this.paymentLabel = paymentLabel;
		this.paymentAmount = paymentAmount;
		this.holdStatus = holdStatus;
	}
	public void setMessageName( String messageName ) {
		this.messageName = messageName;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setEmployeeId( String employeeId ) {
		this.employeeId = employeeId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setPaymentLabel( String paymentLabel ) {
		this.paymentLabel = paymentLabel;
	}
	public String getPaymentLabel() {
		return paymentLabel;
	}
	public void setPaymentAmount( String paymentAmount ) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setHoldStatus( String holdStatus ) {
		this.holdStatus = holdStatus;
	}
	public String getHoldStatus() {
		return holdStatus;
	}
}