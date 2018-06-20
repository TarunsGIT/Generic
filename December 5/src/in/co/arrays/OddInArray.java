package in.co.arrays;

public class OddInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int elements : arr) {
			if (elements % 2 == 0) {
				continue;

			}
			System.out.println("ODD IN ARRAY: " + elements);
		}
	}
}
