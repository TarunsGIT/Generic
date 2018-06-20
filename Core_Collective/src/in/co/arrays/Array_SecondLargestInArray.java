package in.co.arrays;

public class Array_SecondLargestInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 22, 3, 67, 89, 98 };
		int largest = arr[0];
		int second_largest = 0;
		int third = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				third = second_largest;
				second_largest = largest;
				largest = arr[i];
			} else if (arr[i] > largest && arr[i] < second_largest) {
				second_largest = arr[i];
			}
		}

		System.out.println(second_largest);
		System.out.println(third);

	}
}
