package in.co.core_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMapIteration {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(522601, "IBM");
		map.put(522602, "INFOSYS");
		map.put(522603, "TCS");
		map.put(522604, "AMAZON");

		for (Integer i : map.keySet()) {
			System.out.println("Keys: " + i);
		}

		for (String s : map.values()) {
			System.out.println("Values: " + s);
		}
        System.out.println("By Iterator");
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> itk = keySet.iterator();
		while (itk.hasNext()) {
			System.out.println(itk.next());
		}

	}

}
