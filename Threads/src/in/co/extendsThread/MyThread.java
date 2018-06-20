package in.co.extendsThread;

public class MyThread extends Thread {

	private String name = null;

	public MyThread(String n) {
		this.name = n;

	}

	public synchronized void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.print("#" + i + " " + name + " ");
		}

	}

	public static void main(String[] args) {
		MyThread T1 = new MyThread("Yuvi");
		MyThread T2 = new MyThread("MS");
		// T1.setPriority(MAX_PRIORITY);
		// T2.setPriority(MIN_PRIORITY);

		T2.start();
		T1.start();
		try {
			T2.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
