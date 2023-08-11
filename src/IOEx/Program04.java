package IOEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		String name = "";
		int age = 0;
		int no = 0;

		Data data = new Data(no, name, age);

		System.out.println("데이터 저장용 파일이 존재하지 않습니다.");
		System.out.print("파일을 만드시겠습니까?(Y/N)");

		answer = sc.next();

		if (answer.equals("n")) {
			System.out.println("종료합니다.");
			System.exit(0);
		} else
			answer.equals("y");
		File file = new File("info");

		System.out.println("파일이 생성되었습니다.");

		FileOutputStream fos1 = null;

		while (true) {
			System.out.print("명령입력>");
			answer = sc.next();
			if (answer.equals("insert")) {
				System.out.print("이름 :");
				name = sc.next();
				System.out.print("나이 :");
				age = sc.nextInt();
				no++;
//					Data data = new Data(no, name, age);
				System.out.println(no);

				System.out.println("입력완료");
			} else if (answer.equals("list")) {
				System.out.println(data.toString());

			} else if (answer.equals("?")) {
				System.out.println("도움말 ");
				System.out.println("삽입 : insert <이름> <나이>");
				System.out.println("저장 : save ");
				System.out.println("저장 후 종료 : quit ");

			} else if (answer.equals("quit")) {
				System.out.println("시스템을 종료합니다");
				break;
			}

			try {
				fos1 = new FileOutputStream(file, true);
				fos1.write(name.getBytes());
				fos1.write(age);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (fos1 != null) {
					try {
						fos1.close();
					} catch (IOException e) {
						// TODO: handle exception
					}

				}
			}
		}
	}
}
