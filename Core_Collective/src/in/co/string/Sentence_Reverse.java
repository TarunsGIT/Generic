package in.co.string;

public class Sentence_Reverse {

	public static void main(String[] args) {
		String str = "This is corporate";

		String arr[] = str.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(" "+arr[i]);
		}

	}

}
