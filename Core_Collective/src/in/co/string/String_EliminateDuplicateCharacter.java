package in.co.string;

import java.util.HashSet;
import java.util.Set;

public class String_EliminateDuplicateCharacter {

	public static void main(String[] args) {
		String str = "RADAR";

		char arr[] = str.toLowerCase().toCharArray();
		Set<Character> s = new HashSet<Character>();
		for (Character c : arr) {
			s.add(c);
		}

		System.out.println("After Eliminating Duplicate Character From: "
				+ str
				+ " = "
				+ s.toString().replaceAll("\\[", "").replaceAll("\\]", "")
						.replaceAll(",", "").replaceAll(" ", ""));
	}

}
