package deployment;

//Spring requires a POJ class for each message.
public class SubmitItemHoldMsg {
	private String department;
	private String employeeID;
	private String paymentLabel;
	private String holdStatus;
	public SubmitItemHoldMsg() {
	}
	public SubmitItemHoldMsg( String department, 
	                        String employeeID, 
							String paymentLabel, 
							String holdStatus ) {
		this.department = department;
		this.employeeID = employeeID;
		this.paymentLabel = paymentLabel;
		this.holdStatus = holdStatus;
	}
	public void setDepartment( String department ) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setEmployeeID( String employeeID ) {
		this.employeeID = employeeID;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setPaymentLabel( String paymentLabel ) {
		this.paymentLabel = paymentLabel;
	}
	public String getPaymentLabel() {
		return paymentLabel;
	}
	public void setHoldStatus( String holdStatus ) {
		this.holdStatus = holdStatus;
	}
	public String getHoldStatus() {
		return holdStatus;
	}
}