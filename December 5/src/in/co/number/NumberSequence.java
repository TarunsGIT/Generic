package in.co.number;

import java.util.Scanner;

public class NumberSequence {
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		int upperlimit = num;
		int lowerlimit = num - (num - 1);
		for (int i = upperlimit; i > 1; i--) {
			System.out.print(i);
		}
		for (int i = 1; i < lowerlimit; i++) {
			System.out.print(i);
		}
		

	}
}
