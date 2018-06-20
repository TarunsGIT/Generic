package in.co.externlizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Externlizable_TestDeserialization {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		FileInputStream FIS = new FileInputStream(
				"C:/Users/TARUN/Desktop/Externlizable_Employee.ser");
		ObjectInputStream OIS = new ObjectInputStream(FIS);

		Externlizable_Employee emp = (Externlizable_Employee) OIS.readObject();

		if (emp != null) {
			System.out.println(emp.getFirstName());
			System.out.println(emp.getLastName());
			System.out.println(emp.getAge());
			System.out.println(emp.getCity());

		}
		OIS.close();
		FIS.close();

	}

}
