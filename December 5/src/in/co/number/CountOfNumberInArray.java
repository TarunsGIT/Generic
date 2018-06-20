package in.co.number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountOfNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 2, 3, 6, 5, 7, 0, 10, 0 };
		// ArrayList<Integer> AL=new ArrayList<Integer>(Arrays.asList((arr));
		List L = Arrays.asList(arr);
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (int i : arr) {

			if (countMap.containsKey(i)) {
				countMap.put(i, countMap.get(i) + 1);

			} else {
				countMap.put(i, 1);
			}

		}
		System.out.println(countMap);

	}

}
