package in.co.string;

public class String_RecursiveReverse {

	public static String Recursive(String str) {

		if ((str == null) || (str.length() <= 1)) {
			return str;
		}

		return Recursive(str.substring(1)) + str.charAt(0);

	}

	public static void main(String[] args) {
		String str = "tarun";
		System.out.println(Recursive(str));

	}

}
