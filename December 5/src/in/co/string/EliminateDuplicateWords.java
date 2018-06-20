package in.co.string;

import java.util.LinkedHashSet;

public class EliminateDuplicateWords {
	public static void main(String[] args) {

		String str = "World Oh! World is round";
		String arr[] = str.split(" ");
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
        
		for (int i = 0; i < arr.length; i++) {
			LHS.add(arr[i]);

		}
		str = LHS.toString();
		str = str.replaceAll("\\[", "").replaceAll("\\]", "")
				.replaceAll(",", "");
		System.out.println(str);

	}
}