package deployment;

//Spring requires a POJ class for each message.
public class SubmitToFinanceMsg {
	private String department;
	public SubmitToFinance() {
	}
	public SubmitToFinance( String department ) {
		this.department = department;
	}
	public void setDepartment( String department ) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
}