package in.co.runnableThread;

public class MyRunnableThread implements Runnable {

	private String name = null;

	public MyRunnableThread(String n) {
		this.name = n;

	}

	@Override
	public void run() {
		synchronized (this) {

			for (int i = 1; i <= 5; i++) {

				System.out.println("#" + " " + i + " "
						+ name + " ");
				try {
					this.wait(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}
	}

	public static void main(String[] args) {

		MyRunnableThread myt = new MyRunnableThread("MS");
		Thread T1 = new Thread(myt);
		// T1.setDaemon(true);
		System.out.println(T1.getPriority());
		T1.start();

		MyRunnableThread myt1 = new MyRunnableThread("Yuvi");
		Thread T2 = new Thread(myt1);
		// T2.setDaemon(true);
		System.out.println(T2.getPriority());
		T2.start();
	}

}
