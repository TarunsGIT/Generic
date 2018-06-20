package in.co.customexception;

public class TestLoginException {

	public void testCredential(String login, String passcode)
			throws LoginException {

		if (login.equals("Sebastian") && passcode.equals("Tiger")) {
			System.out.println("ACCESS GRANTED");
		} else {
			LoginException e = new LoginException();
			throw e;
		}

	}

	public static void main(String[] args) {
		TestLoginException L = new TestLoginException();
		try {
			L.testCredential("Sebastian", "Tiger");
		} catch (LoginException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

}
