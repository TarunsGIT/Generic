package in.co.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class String_EliminateDuplicateWords {

	public static String formatSet(Set<String> s) {

		String str = s.toString().replaceAll("\\[", "").replaceAll("\\]", "")
				.replaceAll(",", "");
		return str;

	}

	public static void main(String[] args) {

		String str = "Character WiseCase Normalize Character WiseCase Normalize";
		String arr[] = str.split(" ");
		Set<String> LHS = new LinkedHashSet<String>();

		for (String s : arr) {
			LHS.add(s);
		}

		System.out.println(formatSet(LHS));

	}

}
