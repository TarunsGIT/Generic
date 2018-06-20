package in.co.string;

import java.util.LinkedHashSet;

public class EliminateDuplicateCharacter {
	public static void main(String[] args) {
		String str = "CAPGEMENI";

		char arr[] = str.toCharArray();

		LinkedHashSet<Character> LHS = new LinkedHashSet<Character>();

		for (int i = 0; i < arr.length; i++) {
			LHS.add(arr[i]);

		}

		// str = LHS.toString();
		System.out.println(str);

		for (Character c : LHS) {
			System.out.print(c);

		}
	}

}
