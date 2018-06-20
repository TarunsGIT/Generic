package in.co.singleton;

public final class Simple_Singleton {

	private Simple_Singleton() {

	}

	private static Simple_Singleton instance = null;

	public static Simple_Singleton getInstance() {

		if (instance == null) {
			instance = new Simple_Singleton();
		}

		return instance;

	}

}
