package CollectionFramework;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		//String타입만 저장할 수 있는 리스트
		//배열 취급(단, 중간에 삭제, 추가 가능) 
		
		al.add("s");
		al.add("");
		al.add("s");
		al.add("s");
		al.add("s");
		al.add("s");
		al.add("s");
		al.add("s");
		
		al.add(1,"f");
		al.remove(0);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		

	}

}
