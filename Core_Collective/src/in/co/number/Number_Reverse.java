package in.co.number;

public class Number_Reverse {

	public static void main(String[] args) {
		int n = 786;
		int rev = 0;
		while (n >= 1) {
			rev = n % 10;
			n = n / 10;
			System.out.print(rev);
		}

	}

}
