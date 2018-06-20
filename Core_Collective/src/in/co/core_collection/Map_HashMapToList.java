package in.co.core_collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map_HashMapToList {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(522601, "IBM");
		map.put(522602, "INFOSYS");
		map.put(522603, "TCS");
		map.put(522604, "AMAZON");

		List<Integer> KeyList = new LinkedList<Integer>(map.keySet());

		List<String> ValueList = new LinkedList<String>(map.values());

		System.out.println();

		for (int i = 0; i < KeyList.size(); i++) {
			System.out.print(KeyList.get(i) + " ");
		}

		for (int i = 0; i < ValueList.size(); i++) {
			System.out.print(ValueList.get(i) + " ");
		}
		System.out.println();

		List<Entry<Integer, String>> keyValueList = new LinkedList<Map.Entry<Integer, String>>(
				map.entrySet());

		for (Entry<Integer, String> kVL : keyValueList) {
			
			System.out.println(kVL + " ");

		}

	}

}
