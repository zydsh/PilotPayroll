package payrolldeployment;

//Spring requires a POJ class for each message.
public class PayrollAvailableMsg {
	private String messageName;
	private String department;
	public PayrollAvailableMsg() {
	}
	public PayrollAvailableMsg(  String messageName, String department ) {
		this.messageName = messageName;
		this.department = department;
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
}