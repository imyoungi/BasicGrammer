package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
/*
 * HashSet : 중복 허용하지 않음, 순서 보장하지 않음  
 */
public class HashSetEx {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Hello");
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);

		Iterator it = hs.iterator();// get이 아닌 iterator 사용

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(40));
		System.out.println(hs.contains(10));
		System.out.println(hs.size());
		
		/*
		 * 여기서 Iterator로 다시 순회 하려고 한다면?
		 * 출력되지 않음 지금 현재 커서는 맨 끝에 위치
		 * 그럼? 안에 내용을 보고싶다면 다시 Iterator를 생성해야함 
		 */

	}

}
