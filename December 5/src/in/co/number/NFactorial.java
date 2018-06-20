package in.co.number;

public class NFactorial {
	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		while (n != 0) {
			fact = fact * n;
			n--;
		}
		System.out.println(fact);
		do {
			fact = fact * n;
			
		} while (n !=0);
		n--;
		System.out.println(fact);
	}

}
