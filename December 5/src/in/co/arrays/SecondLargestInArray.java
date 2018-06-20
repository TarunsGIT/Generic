package in.co.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 22, 3, 67, 89, 98 };
		int largest = arr[0];
		int secondLargest = 0;
		List<Integer> L = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			L.add(arr[i]);

		}
		Collections.sort(L);
		for (int i = 0; i < L.size(); i++) {
			arr[i] = L.get(i);
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > largest && arr[i] < secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Largest : " + largest);
		System.out.println("Second Largest : " + secondLargest);
	}

}
