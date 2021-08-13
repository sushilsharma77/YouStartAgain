package collectionFramwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("Nepal", "Kathmandu");
		map.put("India", "New Delhi");
		map.put("China", "Bejing");
		map.put("USA", "Washington DC");
		map.put("UK", "London");

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + " " + value);
		}
		for (String k : set) {
			System.out.println(k + " " + map.get(k));
			// System.out.println(map.get(k));
		}
		System.out.println("--------------------");

		Set<Entry<String, String>> entry = map.entrySet();
		for (Entry<String, String> kv : entry) {
			System.out.println(kv);
		}

		System.out.println("--------------------");

		Iterator<Entry<String, String>> i = entry.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
