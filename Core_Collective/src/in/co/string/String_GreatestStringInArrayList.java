package in.co.string;

import java.util.ArrayList;
import java.util.List;

public class String_GreatestStringInArrayList {
	public static void main(String[] args) {
		List<String> L = new ArrayList<String>();
		L.add("a");
		L.add("ab");
		L.add("abc");
		L.add("abcd");

		String largest = L.get(0);
		for (int i = 0; i < L.size(); i++) {
			if (largest.length() < L.get(i).length()) {
				largest = L.get(i);
			}
		}
		
		System.out.println(largest);
	}

}
