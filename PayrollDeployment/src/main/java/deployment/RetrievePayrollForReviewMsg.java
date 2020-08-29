package deployment;

//Spring requires a POJ class for each message.
public class RetrievePayrollForReviewMsg {
	private String department;
	private String holdsOnly;
	public RetrievePayrollForReviewMsg() {
	}
	public RetrievePayrollForReviewMsg( String department, String holdsOnly ) {
		this.department = department;
		this.holdsOnly = holdsOnly;
	}
	public void setDepartment( String department ) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setHoldsOnly( String holdsOnly ) {
		this.holdsOnly = holdsOnly;
	}
	public String getHoldsOnly() {
		return holdsOnly;
	}
}