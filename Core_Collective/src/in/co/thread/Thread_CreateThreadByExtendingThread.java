package in.co.thread;

public class Thread_CreateThreadByExtendingThread extends Thread {

	public String name = null;

	public Thread_CreateThreadByExtendingThread(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("#" + " " + i + " " + name);

		}
	}

	public static void main(String[] args) {

		Thread_CreateThreadByExtendingThread T1 = new Thread_CreateThreadByExtendingThread(
				"MS DHONI");
		Thread_CreateThreadByExtendingThread T2 = new Thread_CreateThreadByExtendingThread(
				"YUVI");

		T1.start();
		T2.start();

	}

}
