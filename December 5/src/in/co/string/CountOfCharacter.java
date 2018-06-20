package in.co.string;

import java.util.HashMap;

public class CountOfCharacter {

	public static void main(String[] args) {

		String str = "CAPGEMENI";
		char arr[] = str.toCharArray();
		HashMap<Character, Integer> countCharMap = new HashMap<Character, Integer>();

		for (Character c : arr) {
			if (countCharMap.containsKey(c)) {
				countCharMap.put(c, countCharMap.get(c) + 1);

			} else {
				countCharMap.put(c, 1);
			}

		}
		System.out.println(countCharMap);

	}

}
