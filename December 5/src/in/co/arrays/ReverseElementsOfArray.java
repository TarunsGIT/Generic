package in.co.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElementsOfArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		ArrayList<Integer> L = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			L.add(arr[i]);
		}

		Collections.reverse(L);

		for (int i = 0; i < L.size(); i++) {
			arr[i] = L.get(i);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
