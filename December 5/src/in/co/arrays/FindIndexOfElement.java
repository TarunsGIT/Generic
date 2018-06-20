package in.co.arrays;

import java.util.Scanner;

public class FindIndexOfElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 5 };
		int index = -1;
		int eTf;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Element");
		eTf = in.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == eTf) {
				index = i;
				break;
			}

		}

		System.out.println("Index:  " + index);
	}
}
