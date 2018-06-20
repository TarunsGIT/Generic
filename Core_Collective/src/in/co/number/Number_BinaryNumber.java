package in.co.number;

public class Number_BinaryNumber {
	public static void main(String[] args) {
		boolean flag = true;
		int num = 11001004;

		while (true) {

			if (num == 0) {
				break;

			} else {
				int temp = num % 10;
				if (temp > 1) {
					flag = false;
					break;
				}
				num = num / 10;
			}

		}

		if (flag) {
			System.out.println("Binary");
		} else {
			System.out.println("Not Binary");
		}

	}

}
