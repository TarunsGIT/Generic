package in.co.string;

public class SReverse {
	public static void main(String[] args) {
		String s = "MAIN METHOD";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);

		}
		System.out.println(reverse);
	}

}
