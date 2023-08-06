package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		System.out.print("입력(현재길이:0):");

		Scanner s = new Scanner(System.in);

		while (true) {
			int num = s.nextInt();
			al.add(num);
			for(int i=0;i<al.size();i++) {
				System.out.print(al.get(i)+",");
			}
			System.out.println();
			System.out.println("입력(현재길이:" + al.size() + "):");

		}

	}
}
