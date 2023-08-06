package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Progam02 {
	Scanner s = new Scanner(System.in);
	HashSet<String> datas = new HashSet<String>();

	public void start() {
		
		int num=0;
		
		while((num=selectMenu())<7) {
			switch (num) {
			case 1:
				register();
				break;
			case 2:
				search();
				break;
			case 3:
				System.out.println("준비 중입니다.");
				break;
			case 4:
				remove();
				break;
			case 5:
				list();
				break;
			case 6:
				removeAll();
				break;
			case 0:
				System.out.println("종료합니다.");;
				break;
				
			default:
				System.out.println("올바른 숫자를 입력하세요.");
				break;
			}
		}
	}

	int selectMenu() {
		int num = 0;
		while (true) {
			System.out.println("1. 등록" + "2. 검색" + "3. 수정" + "4. 삭제" + "5. 목록" + "6. 전체삭제" + "0. 종료");
			num = s.nextInt();
			s.nextLine();
			return num;
			
		}
		
	}

	void register() {
		String age, name = "";

		System.out.println("<등록기능>");
		System.out.println("이름 : ");
		name = s.next();
		datas.add(name);
		Iterator<String> it = datas.iterator();
		System.out.println("나이 : ");
		age = s.next();
		datas.add(age);
		System.out.println(it.next());

		if (datas.add(name)) {
			System.out.println("저장완료");
		} else
			System.out.println("이미 저장된 값입니다.");

	}

	void remove() {
		String name;
		name = s.next();
		datas.remove(name);
		if (datas.remove(name)) {
			System.out.println("삭제되었습니다.");
		} else
			System.out.println("삭제 중 오류 발생.");
	}

	void search() {
		String name;
		name = s.next();
		datas.contains(name);
		Iterator<String> it = datas.iterator();
		System.out.println(it.next());

	}
//	
//	void modify() {
//		
//	}

	void list() {
		System.out.println(datas.size());
	}

	void removeAll() {
		datas.removeAll(datas);

	}

	public static void main(String[] args) {
		Progam02 p2 = new Progam02();
		p2.start();
	}
}