package in.co.checkedExcep;

public class ExceptionPropogation {

	public static void dad() throws Exception {
		mom();
		/*try {
			mom();
		} catch (Exception e) {
			System.out.println(e.getMessage() + " " + "Caught by dad");
		} finally {
			System.out.println("");
		}*/
	}

	public static void mom() throws Exception {
		son();
	}

	public static void son() throws Exception {
		Exception e = new Exception("Raised By Son");
		throw e;
	}

	public static void main(String[] args) throws Exception {
		dad();
	}

}
