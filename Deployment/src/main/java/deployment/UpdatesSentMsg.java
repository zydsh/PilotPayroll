package deployment;

//Spring requires a POJ class for each message.
public class UpdatesSentMsg {
	private String department;
	public UpdatesSentMsg() {
	}
	public UpdatesSentMsg( String department ) {
		this.department = department;
	}
	public void setDepartment( String department ) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
}