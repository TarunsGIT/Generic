package in.co.arrays;


public class EvenInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7 };
         
        
		for (int elements : arr) {
			if (elements % 2 != 0) {
				continue;
			}
			System.out.println("Even In Array : " + elements);

		}

	}

}
