package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {
/*
 * 지금 보면 warning이 보인다
 * HashSet is a raw type. References to generic type HashSet<E> should be parameterized
 * <>이 형식으로 써야한다는 것
 * <> 안에는 데이터 형식을 넣을 수 있음
 * <integer>, <string>,<내가 만든 객체타입> ==>제네릭 표현 
 */
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
//		hs.add("Hello");
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
//		hs.add(new info("sarah",20));

		Iterator<Integer> it = hs.iterator();// get이 아닌 iterator 사용

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(40));
		System.out.println(hs.contains(10));
		System.out.println(hs.size());
	

	}

}
