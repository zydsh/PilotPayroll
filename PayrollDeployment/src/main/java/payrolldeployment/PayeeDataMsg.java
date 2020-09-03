package payrolldeployment;

//Spring requires a POJ class for each message.
public class PayeeDataMsg {
	private String messageName;
	private String department;
	private String employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	public PayeeDataMsg() {
	}
	public PayeeDataMsg( String messageName,
			               String department, 
	                       String employeeId, 
	                       String employeeFirstName, 
                           String employeeLastName ) {
		this.messageName = messageName;
		this.department = department;
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
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
}