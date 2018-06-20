package in.co.arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Elements in Array {A} 3*3:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = in.nextInt();
			}

		}
		System.out.println("Enter Elements in Array {B} 3*3:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {

				b[i][j] = in.nextInt();

			}

		}

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] * b[i][j];

			}

		}

		System.out.println("Product Of Array {A} 3*3 :: Array {B} 3*3");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + " ");
				
			}
		}
	}

}
