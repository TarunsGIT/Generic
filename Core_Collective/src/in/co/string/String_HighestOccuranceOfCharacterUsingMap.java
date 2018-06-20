package in.co.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class String_HighestOccuranceOfCharacterUsingMap {

	public static void main(String[] args) {
		String str = "Occurance";
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		for (char c : str.toLowerCase().toCharArray()) {

			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c) + 1);

			} else {
				countMap.put(c, 1);
			}

		}
		System.out.println(countMap);

		List<Integer> valueList = new ArrayList<Integer>();
		for (Integer values : countMap.values()) {

			valueList.add(values);

		}
		int maxOccurance = valueList.get(0);
		for (int i = 0; i < valueList.size(); i++) {

			if (maxOccurance < valueList.get(i)) {

				maxOccurance = valueList.get(i);
			}

		}

		Character maxOccuranceCharacter = ' ';

		for (Entry<Character, Integer> entry : countMap.entrySet()) {

			if (entry.getValue() == maxOccurance) {
				maxOccuranceCharacter = entry.getKey();
			}

		}
		System.out.println("Max Occurance Character In String: " + str + " is "
				+ maxOccuranceCharacter + " " + maxOccurance + " times ");

	}

}
