package in.co.number;

public class NPalindrome {
	public static void main(String[] args) {
		int n = 129;
		int s = 0, r;
		int temp;
		temp = n;
		while (n != 0) {
			r = n % 10;
			s = s * 10 + r;
			n = n / 10;

		}

		if (s == temp) {
			System.out.println("Palindrome Number ");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
