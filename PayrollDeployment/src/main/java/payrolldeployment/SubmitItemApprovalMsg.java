package payrolldeployment;

//Spring requires a POJ class for each message.
public class SubmitItemApprovalMsg {
	private String department;
	private String employeeId;
	private String paymentLabel;
	public SubmitItemApprovalMsg() {
	}
	public SubmitItemApprovalMsg( String department, 
	                          String employeeId, 
							  String paymentLabel ) {
		this.department = department;
		this.employeeId = employeeId;
		this.paymentLabel = paymentLabel;
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
}