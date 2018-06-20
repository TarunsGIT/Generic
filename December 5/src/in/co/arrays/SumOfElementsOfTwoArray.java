package in.co.arrays;

public class SumOfElementsOfTwoArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 5, 4, 3, 2, 1 };
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i] + b[i];
		}
		System.out.println(sum);

	}
}
