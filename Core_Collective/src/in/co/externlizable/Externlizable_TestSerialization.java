package in.co.externlizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Externlizable_TestSerialization {

	public static void main(String[] args) throws IOException {

		FileOutputStream FOS = new FileOutputStream(
				"C:/Users/TARUN/Desktop/Externlizable_Employee.ser");
		ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		Externlizable_Employee emp = new Externlizable_Employee("Dhvani",
				"Bhanusali", 25L, "Hyderabad");
		OOS.writeObject(emp);
		if (OOS != null) {
			System.out.println("Serialized....");
		}
		OOS.close();
		FOS.close();

	}

}
