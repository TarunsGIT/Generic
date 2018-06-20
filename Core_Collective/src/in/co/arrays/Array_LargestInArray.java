package in.co.arrays;

public class Array_LargestInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 22, 3, 67, 89, 98 };
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println(largest);
	}

}
