package in.co.equalsandhashcode;


public class Car {

	private String name;
	private String colour;
	private String model;

	public Car(String n, String c, String m) {

		this.name = n;
		this.colour = c;
		this.model = m;

	}

	// TO CHECK EQUALITY OF VALUES INSIDE OBJECT
	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return false;
		}

		if (obj == null) {
			return false;
		}

		if (obj.getClass() != this.getClass()) {
			return false;
		}

		if (obj instanceof Car) {
			Car c = (Car) obj;
			return this.colour.equals(c.colour);
		}
		return false;

	}
	@Override
	public int hashCode() {
		return this.colour.hashCode();

	}

	public String toString() {
		return " name : " + name + " colour : " + colour
				+ " model : " + model;
	}

	/*
	 * public static void main(String[] args) { Car c1 = new Car("Maruti",
	 * " White ", "2007"); Car c2 = new Car("Maruti", " White ", "2000");
	 * 
	 * HashSet<Car> s = new HashSet<Car>(); s.add(c1); s.add(c2); Iterator<Car>
	 * it = s.iterator(); while (it.hasNext()) { Car c = it.next();
	 * System.out.println(c); } System.out.println(s.size());
	 * 
	 * }
	 */

}
