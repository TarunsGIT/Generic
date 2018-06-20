package in.co.synchronizedthread;

public class SynchronizedThread extends Thread {

	private String name = null;
	public Object mutex = new Object();

	public SynchronizedThread(String n) {
		this.name = n;
	}

	 public void run() {

		synchronized (mutex) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i + " " + name);
			}
		}

	}

	public static void main(String[] args) {
		SynchronizedThread T1 = new SynchronizedThread("DHONI");
		SynchronizedThread T2 = new SynchronizedThread("YUVRAJ");
		T1.start();
		T2.start();
	}
}
