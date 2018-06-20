package in.co.equalsandhashcode;

import java.util.HashSet;
import java.util.Iterator;

public class TestDriver {
	public static void main(String[] args) {

		HashSet<Driver> HS = new HashSet<Driver>();
		HS.add(new Driver("R", "R", " RR100 "));
		HS.add(new Driver("J", "J", " JJ100 "));
		HS.add(new Driver("K", "K", " KK100 "));
		HS.add(new Driver("L", "L", " RR100 "));

		Iterator<Driver> it = HS.iterator();
		while (it.hasNext()) {
			Driver retriveDriver = it.next();
			System.out.println(retriveDriver.getFirstName() + " "
					+ retriveDriver.getLastName() + " "
					+ retriveDriver.getLicenceNo());
		}

		for (Driver dr : HS) {
			System.out.println(dr);
		}

	}

}
