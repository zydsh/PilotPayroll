package payrolldeployment;

//Spring requires a POJ class for each message.
public class SubmitToFinanceMsg {
	private String department;
	public SubmitToFinanceMsg() {
	}
	public SubmitToFinanceMsg( String department ) {
		this.department = department;
	}
	public void setDepartment( String department ) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
}