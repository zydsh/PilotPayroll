package payrolldeployment;

//Spring requires a POJ class for each message.
public class UpdatesSentMsg {
	private String department;
	private String count;
	public UpdatesSentMsg() {
	}
	public UpdatesSentMsg( String department, String count ) {
		this.department = department;
		this.count = count;
	}
	public void setDepartment( String department ) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setCount( String count ) {
		this.count = count;
	}
	public String getCount() {
		return count;
	}
}