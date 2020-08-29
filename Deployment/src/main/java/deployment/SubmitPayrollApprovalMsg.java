package deployment;

//Spring requires a POJ class for each message.
public class SubmitPayrollApprovalMsg {
	private String department;
	public SubmitItemHoldMsg() {
	}
	public SubmitItemHoldMsg( String department ) {
		this.department = department;
	}
	public void setDepartment( String department ) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
}