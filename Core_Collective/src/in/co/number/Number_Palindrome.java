package in.co.number;

public class Number_Palindrome {
	public static void main(String[] args) {
		int n = 555;
		int r = 0, s = 0;
		int temp;
		temp = n;
		while (n != 0) {
			r = n % 10;
			s = (s * 10) + r;
			n = n / 10;
		}

		if (s == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
