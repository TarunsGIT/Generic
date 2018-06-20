package in.co.cloning;

public class ShallowCloning_BankAccount implements Cloneable {

	protected double balance;

	public ShallowCloning_BankAccount(double balance) {
		this.balance = balance;
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCloning_BankAccount b1 = new ShallowCloning_BankAccount(10);
		ShallowCloning_BankAccount b2 = (ShallowCloning_BankAccount) b1.clone();
		b2.balance = 20;
		System.out.println(b1.balance);
		System.out.println(b2.balance);

	}

}
