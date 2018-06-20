package in.co.arrays;

public class Array_BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 22, 3, 67, 89, 98 };
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
