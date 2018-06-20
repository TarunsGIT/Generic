package in.co.number;

import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String[] args) {
		int year;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Year..");
		year=in.nextInt();
		if(year%400==0){
			System.out.println("Leap");
		}else if(year%100==0){
			System.out.println("Not Leap");
		}else if(year%4==0){
			System.out.println("Leap");
		}else{
			System.out.println("Not Leap");
		}
		
	}
}
