package deployment;

//Spring requires a POJ class for each message.
public class NotificationMsg {
	private String messageName;
	private String code;
	private String message;
	public NotificationMsg() {
	}
	public NotificationMsg( String messageName, String code, String message ) {
		this.messageName = messageName;
		this.code = code;
		this.message = message;
	}
	public void setMessageName( String messageName ) {
		this.messageName = messageName;
	}
	public String getMessageName() {
		return messageName;
	}
	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	public void setCode( String code ) {
		this.code = code;
	}
	public void setMessage( String message ) {
		this.message = message;
	}
}