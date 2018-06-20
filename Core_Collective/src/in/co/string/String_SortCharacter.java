package in.co.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_SortCharacter {

	public static void main(String[] args) {
		String str = "TT World Cup";
		System.out.println(str.length());
		List<Character> L = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			L.add(str.toLowerCase().charAt(i));

		}

		Collections.sort(L);
		str = L.toString();
		str = str.replaceAll("\\[", "").replaceAll("\\]", "")
				.replaceAll("[,]", "");
		System.out.println(str);

	}

}
