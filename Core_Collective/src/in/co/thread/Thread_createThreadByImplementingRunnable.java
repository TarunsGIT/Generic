package in.co.thread;

public class Thread_createThreadByImplementingRunnable implements Runnable {

	public String name = null;

	public Thread_createThreadByImplementingRunnable(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("#" + " " + i + " " + name + " ");
		}
	}

	public static void main(String[] args) {

		Thread_createThreadByImplementingRunnable T1 = new Thread_createThreadByImplementingRunnable(
				"MS DHONI");

		Thread_createThreadByImplementingRunnable T2 = new Thread_createThreadByImplementingRunnable(
				"YUVI");

		Thread MS = new Thread(T1);
		MS.start();

		Thread YUVI = new Thread(T2);
		YUVI.start();

	}

}
