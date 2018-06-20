package in.co.arrays;

public class LargestInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 22, 3, 67, 89, 98 };
		int greatest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > greatest) {
				greatest = arr[i];
			}
		}
		System.out.println("Greatest : "+greatest);

	}

}
