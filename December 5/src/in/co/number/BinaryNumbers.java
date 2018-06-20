package in.co.number;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		boolean flag = true;
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Binary Number ");
		number = in.nextInt();
		while (true) {
			if (number == 0) {
				break;
			} else {
				int temp = number % 10;
				if (temp > 1) {
					flag = false;
					break;

				}
				number = number / 10;
				}}
		 if(flag){
			System.out.println("Binary");
		}else{
			System.out.println("Not Binary");
		}
		in.close();
	}

}
