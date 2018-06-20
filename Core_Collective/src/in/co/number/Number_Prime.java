package in.co.number;

public class Number_Prime {
	public static void main(String[] args) {
		int n = 5;
		int c;
		for (c = 2; c <= n - 1; c++) {
			if (n % c == 0) {
				System.out.println("Not Prime");
				break;
			}
		}

		if (c == n) {
			System.out.println("Prime");
		}
	}

}
