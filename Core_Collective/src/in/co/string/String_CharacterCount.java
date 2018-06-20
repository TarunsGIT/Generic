package in.co.string;

import java.util.HashMap;

public class String_CharacterCount {
	public static void main(String[] args) {
		String str = "Radar";

		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		//char arr[] = str.toLowerCase().toCharArray();
		for (char c : str.toLowerCase().toCharArray()) {

			if (countMap.containsKey(c)) {

				countMap.put(c, countMap.get(c) + 1);

			} else {
				countMap.put(c, 1);
			}

		}
		
		System.out.println(countMap);

	}

}
