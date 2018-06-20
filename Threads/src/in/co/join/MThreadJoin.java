package in.co.join;

import java.util.ArrayList;
import java.util.List;

public class MThreadJoin {

	public static List<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		List<ThreadJoin> L = new ArrayList<ThreadJoin>();
		for (int i = 0; i < 10; i++) {
			ThreadJoin TJ = new ThreadJoin();
			L.add(TJ);
			TJ.start();

		}

		for (ThreadJoin tj : L) {
			try {
				tj.join();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		System.out.println(names);
	}

}
