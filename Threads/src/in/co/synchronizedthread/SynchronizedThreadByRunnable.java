package in.co.synchronizedthread;

public class SynchronizedThreadByRunnable implements Runnable {

	String name = null;

	protected SynchronizedThreadByRunnable(String n) {
		this.name = n;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("#" + i + " " + name);
			try {
				Thread.sleep(60*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		/*
		 * SynchronizedThreadByRunnable T1 = new SynchronizedThreadByRunnable(
		 * "MS DHONI"); SynchronizedThreadByRunnable T2 = new
		 * SynchronizedThreadByRunnable( "YUVRAJ SINGH");
		 * 
		 * T1.run(); T2.run();
		 */

		SynchronizedThreadByRunnable Dhoni = new SynchronizedThreadByRunnable(
				"MS DHONI");
		Thread T1 = new Thread(Dhoni);
		SynchronizedThreadByRunnable Yuvraj = new SynchronizedThreadByRunnable(
				"Yuvraj");
		Thread T2 = new Thread(Yuvraj);
		T1.start();
		if (T1.isAlive()) {
			T2.start();
		}

	}

}
