package in.co.singleton;

public final class ThreadSafe_Singleton {

	private ThreadSafe_Singleton() {

	}

	private static ThreadSafe_Singleton instance = null;
	private static Object mutex = new Object();

	public static ThreadSafe_Singleton getInstance() {

		synchronized (mutex) {

			if (instance == null) {
				instance = new ThreadSafe_Singleton();
			}

		}

		return instance;

	}

}
