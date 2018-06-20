package in.co.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class String_FindDuplicateCharacter {

	public static void main(String[] args) {
		String str = "RADAR";
		char arr[] = str.toLowerCase().toCharArray();
		HashSet<Character> HS = new HashSet<Character>();
		List<Character> duplicateCharacter = new ArrayList<Character>();
		for (Character c : arr) {

			if (!HS.add(c)) {
				duplicateCharacter.add(c);
			}

		}

		System.out.println("Duplicate Character In: " + str + " "
				+ duplicateCharacter);

	}

}
