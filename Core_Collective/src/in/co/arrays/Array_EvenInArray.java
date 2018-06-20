package in.co.arrays;

public class Array_EvenInArray {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 54, 66 };

		for (int i = 0; i < arr.length; i++) {
			if(i%2==0){
				continue;
			}
			System.out.print(" " + arr[i]);

		}
		

	}

}
