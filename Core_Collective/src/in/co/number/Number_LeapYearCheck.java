package in.co.number;

public class Number_LeapYearCheck {

	public static void main(String[] args) {
		int year = 2007;

		if (year % 400 == 0) {
			System.out.println("Leap Year");
		} else if (year % 100 == 0) {
			System.out.println("Not Leap");
		} else if (year % 4 == 0) {
			System.out.println("Leap Year");

		} else {
			System.out.println("Not Leap");
		}

	}

}
