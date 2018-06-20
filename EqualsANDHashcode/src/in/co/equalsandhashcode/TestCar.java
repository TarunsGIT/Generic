package in.co.equalsandhashcode;

import java.util.HashSet;

public class TestCar {
	public static void main(String[] args) {

		HashSet<Car> HS = new HashSet<Car>();
		HS.add(new Car("Maruti", "White", "2007"));
		HS.add(new Car("Maruti", "White", "2000"));
		
		for(Car caar:HS){
			System.out.println(caar);
		}
   
	}

}
