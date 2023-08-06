package ExceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int input1 = 0;
		int input2 = 0;
		int result = 0;

		try {
			System.out.println("숫자를 입력하세요!");
			input1 = s.nextInt();
			System.out.println("숫자를 입력하세요!");
			input2 = s.nextInt();
			result = input1 / input2;
			System.out.println(input1 + "/" + input2 + "=" + result);

		} catch (InputMismatchException e) {
			System.out.println("Input Form Exception");
			e.printStackTrace();

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {
			System.out.println("무조건 실행되는 블록 ");
			System.out.println("자원해제 블록");

		}
		System.out.println("프로그램 정상종료!");

	}

}
