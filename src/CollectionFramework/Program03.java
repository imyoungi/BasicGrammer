package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList활용한 간단 관리프로그램 만들기

public class Program03 {
	public static void main(String[] args) {

		int no = 0; // 인덱스 발급용
		int cnt = 0; // 삭제, 수정 인덱스 번호
		String name = "";
		int age = 0;
		int num = 0; // 실행할 기능번호

		ArrayList<Data> al = new ArrayList<Data>();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("1.등록 " + "2.전체검색 " + "3.목록 " + "4.삭제 " + "5.검색 " + "6.전체삭제 " + "0.종료");
			num = s.nextInt();

			if (num == 0) {
				System.out.println("종료합니다.");
				break;
			}

			switch (num) {

			case 1:
				no++;
				System.out.print("이름 : ");
				name = s.next();
				System.out.print("나이 : ");
				age = s.nextInt();
				System.out.println("저장완료");
				al.add(new Data(no, name, age));
				break;

			case 2:
				if (al.size() == 0) {
					System.out.println("데이터가 없습니다.");
				}
				for (int i = 0; i < al.size(); i++)
					System.out.println(al.get(i));
				break;

			case 3:
				System.out.println("전체 데이터(행) :" + al.size());
				break;

			case 4:
				System.out.println("삭제할 No. 를 입력하세요.");
				for (int i = 0; i < al.size(); i++)
					System.out.println(al.get(i));
				cnt = s.nextInt();
				al.remove(cnt - 1);
				System.out.println("현재 데이터 " + al.toString());
				break;

			case 5:
				cnt = s.nextInt();
				if (0 > cnt && no < cnt) {
					System.out.println("데이터가 존재하지 않습니다.");
				} else if (al.size() == 0) {
					System.out.println("데이터가 없습니다.");
				}
				for (int i = 0; i < al.size(); i++)
					System.out.println(al.get(i));

				for (int i = 0; i < al.size(); i++) {
					if (cnt == al.get(i).getNo()) {
						name = s.next();
						al.get(i).setName(name);
						age = s.nextInt();
						al.get(i).setAge(age);
					}
				}
				System.out.println("수정되었습니다.");
				break;

			case 6:
				al.removeAll(al);
				System.out.println("모든 데이터를 삭제했습니다.");
				break;

			}

		}
		s.close();

	}
}
/*
 * 검색기능 : 이름 검색하면 Data[]~ 출력 
 * 삭제기능 : 번호 입력하면 그 라인 모두 삭제 
 * 수정기능 : 번호 입력하면 두 내역 수정
 */
