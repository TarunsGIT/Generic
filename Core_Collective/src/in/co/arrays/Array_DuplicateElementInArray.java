package in.co.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_DuplicateElementInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 5, 6, 6 };

		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (Integer i : arr) {

			if (!set.add(i)) {
				list.add(i);
			}

		}

		System.out.println("Duplicate in Array: ");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
