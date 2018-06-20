package in.co.string;

public class String_Palindrome {

	public static void main(String[] args) {
		String str = "radar rad";
		Boolean flag = true;
		char arr[] = str.toLowerCase().toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[str.trim().length() - i - 1]) {
				flag = false;
				break;
			}
		}
		
		if(!flag){
			System.out.println("Not Palindrome");
		}else{
			System.out.println("Palindrome");
		}

	}

}
