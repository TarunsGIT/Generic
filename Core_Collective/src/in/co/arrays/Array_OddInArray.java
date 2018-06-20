package in.co.arrays;

public class Array_OddInArray {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 65 };
		
		for(int i=0;i<arr.length;i++){
			if(i%2!=0){
				continue;
			}
			System.out.print(arr[i] + " ");
		}
	}

}
