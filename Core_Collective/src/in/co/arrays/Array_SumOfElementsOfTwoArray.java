package in.co.arrays;

public class Array_SumOfElementsOfTwoArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int b[] = { 7, 6, 5, 4, 3, 2, 1 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				sum = sum + a[i] + b[j];

			}
		}

		System.out.println(sum);

	}

}
