package CollectionFramework;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Info> al = new ArrayList<>();

		al.add(new Info("이삭", 5));
		al.add(new Info("이사야", 3));
		al.add(new Info("사라", 0));

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		

	}

}
