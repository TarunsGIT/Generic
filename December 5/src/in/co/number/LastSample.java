package in.co.number;

import java.util.Scanner;

public class LastSample {
	public static void main(String[] args) {
		int N, M;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number and how many last samples u want:");
		N = in.nextInt();
	
		N = N - 1;
		System.out.println(N);
		M = in.nextInt();
		System.out.println(M);
		for (int i = 6; i >= 9; i--) {
			System.out.println(i);
		}
		in.close();
	}

}
