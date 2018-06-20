package in.co.number;

public class NPrime {
	public static void main(String[] args) {
		int n = 5;
		int c;
		for (c = 2; c <= n - 1; c++) {
			if (n % c == 0) {
				System.out.println("Not Prime :" + n);
				break;
			}

		}
		if (n == c) {
			System.out.println("Prime :" + n);
		}
	}

}
