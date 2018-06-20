package in.co.cloning;

public class DeepCloning_Customer implements Cloneable {

	public String name;
	public ShallowCloning_BankAccount account;

	public DeepCloning_Customer(String name) {
		this.name = name;
		account = new ShallowCloning_BankAccount(10);

	}

	public Object clone() throws CloneNotSupportedException {

		DeepCloning_Customer c = (DeepCloning_Customer) super.clone();
		c.account = (ShallowCloning_BankAccount) account.clone();
		return c;

	}

	public static void main(String[] args) throws CloneNotSupportedException {

		DeepCloning_Customer c1 = new DeepCloning_Customer("Ram");
		DeepCloning_Customer c2 = (DeepCloning_Customer) c1.clone();
		c2.name = "Laxman";
		c2.account.balance = 20.0;
		System.out.println("*** ORIGINAL OBJECT ***");
		System.out.println("NAME " + c1.name);
		System.out.println("BALANCE " + c1.account.balance);
		System.out.println("*** CLONED OBJECT ***");
		System.out.println("NAME " + c2.name);
		System.out.println("BALANCE " + c2.account.balance);

	}

}
