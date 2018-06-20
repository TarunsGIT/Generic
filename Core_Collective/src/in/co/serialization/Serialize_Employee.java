package in.co.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize_Employee {

	public static void main(String[] args) throws IOException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		FileOutputStream FOU = new FileOutputStream(
				"C:/Users/TARUN/Desktop/Employee.ser");
		ObjectOutputStream OIS = new ObjectOutputStream(FOU);

		/*
		 * Employee emp = (Employee)
		 * Class.forName("in.co.serialization.Employee") .newInstance();
		 */

		Employee emp = new Employee("Dhvani", "Bhanusali", 25, "Mysore");
		OIS.writeObject(emp);
		if (OIS != null) {
			System.out.println("Serialized....." + OIS);
		}

	}
}
