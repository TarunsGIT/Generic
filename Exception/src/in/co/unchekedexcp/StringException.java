package in.co.unchekedexcp;

public class StringException {
	public static void main(String[] args) {

		String s = "two";

		try {

			System.out.println(s.length());
			System.out.println(s.charAt(3));

		} catch (StringIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
			System.exit(0);

		} finally {

			System.out.println("Finally Executed");
		}

	}
}