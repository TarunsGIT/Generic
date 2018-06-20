package in.co.number;

public class NArmstrong {
	public static void main(String[] args) {
		int n = 787;
		int s = 0, r;
		int temp = n;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			s = s + (r * r * r);
		}
		if (s == temp) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}

}
