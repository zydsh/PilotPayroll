package payrolldeployment;

//Spring requires a POJ class for each message.
public class NotificationMsg {
	private String messageName;
	private String ident;
	private String content;
	public NotificationMsg() {
	}
	public NotificationMsg( String messageName, String ident, String content ) {
		this.messageName = messageName;
		this.ident = ident;
		this.content = content;
	}
	public void setMessageName( String messageName ) {
		this.messageName = messageName;
	}
	public String getMessageName() {
		return messageName;
	}
	public String getIdent() {
		return ident;
	}
	public String getContent() {
		return content;
	}
	public void setIdent( String ident ) {
		this.ident = ident;
	}
	public void setContent( String content ) {
		this.content = content;
	}
}