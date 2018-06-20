package in.co.string;

import java.util.ArrayList;
import java.util.List;

public class String_LargestStringInArrayList {

	public static void main(String[] args) {
		List<String> L = new ArrayList<String>();
		L.add("a");
		L.add("ab");
		L.add("abc");
		L.add("abcd");
		//L.add(null);

		int largest = L.get(0).length();
		String largestString = "";
		for (int i = 0; i < L.size(); i++) {

			if (largest < L.get(i).length()) {

				largest = L.get(i).length();
				largestString = L.get(i);

			}

		}
		System.out.println(largestString);

	}
}
