package in.co.arrays;

import java.util.ArrayList;
import java.util.List;

public class SumOfAlphaNumericArray {
	public static void main(String[] args) {
		int arr[] = { 'a', 2, 'b', 3, 'c', 4, 'd','@' };
		List<Integer> L = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			
			L.add(arr[i]);
			
		}
		System.out.println(L);
	}
}
