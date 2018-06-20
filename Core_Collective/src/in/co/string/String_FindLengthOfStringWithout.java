package in.co.string;

public class String_FindLengthOfStringWithout {
	public static void main(String[] args) {
		String str = new String("Radar");
		int length = str.lastIndexOf("");
		System.out.println(length);
		int length1=str.toCharArray().length;
		System.out.println(length1);
		int length2=str.split("").length-1;
		System.out.println(length2);
	}

}
