package in.co.customexception;

public class LoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public LoginException(){
		super("INVALID LOGIN ID AND PASSWORD");
	}
	
}
