package payrolldeployment;

//Spring requires a POJ class for each message.
public class SubmitItemHoldMsg {
	private String department;
	private String employeeId;
	private String paymentLabel;
	private String holdStatus;
	public SubmitItemHoldMsg() {
	}
	public SubmitItemHoldMsg( String department, 
	                          String employeeId, 
							  String paymentLabel, 
							  String holdStatus ) {		this.department = department;
		this.employeeId = employeeId;
		this.paymentLabel = paymentLabel;
		this.holdStatus = holdStatus;
	}
	public void setDepartment( String department ) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
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
	public void setHoldStatus( String holdStatus ) {
		this.holdStatus = holdStatus;
	}
	public String getHoldStatus() {
		return holdStatus;
	}
}