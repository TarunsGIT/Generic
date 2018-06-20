package in.co.string;

public class StentenceReverse {
	public static void main(String[] args) {
		String str = "Simple,Straight & Blunt";
		System.out.println(str);
		String arr[] = str.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}
