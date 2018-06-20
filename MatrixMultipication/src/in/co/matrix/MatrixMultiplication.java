package in.co.matrix;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rows and cloumn of matrix");
		n = in.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		int[][] c = new int[n][n];
		
		System.out.println("Enter Elements row wise in first matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextInt();

			}

		}
		System.out.println("Enter elements in second matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = in.nextInt();

			}

		}

		System.out.println("Matrix Multiplication");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];

				}

			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}
		in.close();
	}
}
