package in.co.arrays;

public class Array_CountOfGreatestNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 5, 6, 6 };

		int greatest = arr[0];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > greatest) {
				greatest = arr[i];
			}
		}

		System.out.println(greatest);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == greatest) {
				count++;
			}
		}

		System.out.println(greatest + " = " + count + " times");

	}

}
