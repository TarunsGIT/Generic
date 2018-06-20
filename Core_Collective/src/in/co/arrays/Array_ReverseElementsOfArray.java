package in.co.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_ReverseElementsOfArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> AL = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			AL.add(arr[i]);
		}

		System.out.println(AL);

		Collections.reverse(AL);

		for (int i = 0; i < AL.size(); i++) {
			arr[i] = AL.get(i);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
