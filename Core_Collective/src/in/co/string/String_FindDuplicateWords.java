package in.co.string;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
/*String buffer does not overide equals() method*/
public class String_FindDuplicateWords {
	@SuppressWarnings("rawtypes")
	public static String ListFormatter(List L) {

		String str = L.toString().replaceAll("\\[", "").replaceAll("\\]", "")
				.replaceAll(",", "");

		return str;

	}

	public static void main(String[] args) {
		String str = "Character WiseCase Normalize Character WiseCase Normalize";
		String arr[] = str.split(" ");
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		LinkedList<String> LL = new LinkedList<String>();

		for (String s : arr) {

			if (!LHS.add(s)) {
				LL.add(s);
			}

		}

		System.out.println("Dulicate Words In String : " + str + " = "
				+ ListFormatter(LL));

	}

}
