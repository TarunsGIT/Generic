package in.co.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCharacterInString {
	public static void main(String[] args) {
		String str = "CAPGEMENI";
		char arr[] = str.toCharArray();
		List<Character> L = new ArrayList<Character>();

		for (int i = 0; i < arr.length; i++) {

			L.add(arr[i]);

		}

		Collections.sort(L);

		str = L.toString();
		str = str.replaceAll("\\[", "").replaceAll("\\]", "")
				.replaceAll(",", "").trim();
		System.out.println(str);

	}

}
