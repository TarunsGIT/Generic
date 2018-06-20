package in.co.arrays;

import java.util.Scanner;

public class Array_IndexOfElementInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 22, 3, 67, 89, 98 };
		int index = -1;
		int eTF;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Element Index to be find");
		eTF = in.nextInt();
		int i;
		for (i = 0; i < arr.length; i++) {
			if (eTF == arr[i]) {

				index = i;
				break;

			}

		}

		if (index == -1) {
			System.out.println("Element " + eTF + " does not exists");
		} else {
			System.out.println("Index of " + eTF + " : " + index);
		}
	}

}
