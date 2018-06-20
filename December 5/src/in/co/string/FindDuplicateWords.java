package in.co.string;

import java.util.LinkedHashSet;

public class FindDuplicateWords {
	public static void main(String[] args) {
		String str = "World Oh ! World is round so round !";
		String arr[] = str.split(" ");
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		for (String words : arr) {
			if (!LHS.add(words)) {
				System.out.print(words + " ");
			}
		}
	}
}
