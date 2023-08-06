package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/*
 *k-v의 형식
 *k는 중복 불가, v는 상관없음 
 */

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, Info> hm = new HashMap<>();

		// hm.put("hell0", 100);
		// hm.put(10, "tester");
		hm.put(1, new Info("홍동", 12));
		hm.put(2, new Info("진수", 44));
		hm.put(3, new Info("손흥", 454));
		hm.put(4, new Info("홍동", 677));
		hm.put(5, new Info("Hello", 97));
//		hm.put("String", "Im String");

		System.out.println(hm.get(1));
		System.out.println(hm.get(11));

		Set<Integer> keys = hm.keySet();
		Iterator<Integer> it = keys.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (Integer o : keys) {
			System.out.println(o);
		}

		Collection<Info> values = hm.values();
		for (Info o : values) {
			System.out.println(o);
		}
		it = keys.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			Info value = hm.get(key);
			System.out.println(key +": "+value);

		}

	}
}
