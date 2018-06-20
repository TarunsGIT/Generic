package in.co.number;

import java.util.Scanner;

public class SumOfNaturalDivisibleBy5or3 {
	public static void main(String[] args) {
		int max;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Max Number:");
		max = in.nextInt();
		for (int i = 0; i < max; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;

			}

		}

		System.out.println("Sum :" + sum);
        in.close();
	}

}
