package deployment;

//Spring requires a POJ class for each message.
public class PayrollDataMsg {
	private String messageName;
	private String department;
	private String employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String paymentLabel;
	private String paymentAmount;
	private String holdStatus;
	public PayrollDataMsg() {
	}
	public PayrollDataMsg( String messageName,
			               String department, 
	                       String employeeId, 
	                       String employeeFirstName, 
                           String employeeLastName, 
                           String paymentLabel, 
                           String paymentAmount,
                           String holdStatus ) {
		this.messageName = messageName;
		this.department = department;
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
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
	public void setDepartment( String department ) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setEmployeeID( String employeeId ) {
		this.employeeId = employeeId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeFirstName( String employeeFirstName ) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeLastName( String employeeLastName ) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
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