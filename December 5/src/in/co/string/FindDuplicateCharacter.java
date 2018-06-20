package in.co.string;

import java.util.LinkedHashSet;

public class FindDuplicateCharacter {
	public static void main(String[] args) {
		String str = "TARRAUN";
		char arr[] = str.trim().toCharArray();

		LinkedHashSet<Character> LHS = new LinkedHashSet<Character>();
		System.out.println("Duplicate Character : ");
		for (Character C : arr) {
			if (!LHS.add(C)) {
				System.out.print(C);
			}

		}
	}

}
