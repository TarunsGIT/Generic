package in.co.string;

public class String_FirstAndLast {

	public static void main(String[] args) {
		String str = "FirstAndLast";
		String input = str.substring(1, str.length() - 1);
		//System.out.println(input);
		String rev="";
		for(int i=input.length()-1;i>=0;i--){
			rev=rev+input.charAt(i);
		}
		
		System.out.println(rev);
	}

}
