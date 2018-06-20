package in.co.arrays;

public class Array_SumOfElementOfArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sumOfElements = 0;

		for (int i = 0; i < arr.length; i++) {
			sumOfElements = sumOfElements + arr[i];

		}
		System.out.println(sumOfElements);
	}

}
