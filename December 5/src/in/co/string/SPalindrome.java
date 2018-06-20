package in.co.string;

public class SPalindrome {
	public static void main(String[] args) {

		String str = "RADAR";
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			char arr[] = str.toUpperCase().toCharArray();

			if (arr[i] != arr[str.length() - i - 1]) {
				flag = false;
				break;
			}

		}

		if (!flag) {
			System.out.println("Not Palindrome : " + str);
		} else {
			System.out.println("Palindrome : " + str);
		}
	}

}
