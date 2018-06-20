package in.co.arrays;

import java.util.Scanner;

public class FindElementInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Element To Be Found");
		int ele = in.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				flag = true;

			} 
		}
		if (flag==true) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		in.close();
	}
}
