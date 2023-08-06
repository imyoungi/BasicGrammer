package Object;

import java.util.Scanner;

class Test5 {

	int input;

	void MethodA() {
		System.out.println("동일한 문자를 입력하셨습니다. ");
	}

	/* #2 */
	@Override
	public int hashCode() {
		final int prime = 31; // 기준 값
		int result = 1;
		result = prime * result + input;
		/*
		 * 정해진 값=고정된 값에 지금 a만 들어간 상황 동일한 수식에 동일한 값이 들어가면 동일한 결과가 나옴 분명 다른 객체이기 때문에 해시코드로
		 * 다르게 취금하기 위함이였는데 이 수식(오버라이딩)을 통해 객체가 가지고 있는 값이 동일하다면, 해시코드 값도 동일하게 셋팅할 수 있음
		 * 객체가 가지고 있는 값이 동일하다면, 해시코드가 다르더라도 하나로 취급할 수 있음
		 *
		 */

		return result;
	}

}

public class ObjectEx4 {

	public static void main(String[] args) {
		
//		Test5 obj1 = new Test5();
//		obj1.hashCode();
		
		String[] arr = new String[2];

		while (true) {
			System.out.println("문자를 입력하세요!");
			Scanner s1 = new Scanner(System.in);
			
			for(int i=0;i<=arr.length;i++) {
				arr[i] = s1.next();
				
				
				if(arr[i]== arr[i+1]) {
					System.out.println("동일한 값을 입력하셨습니다.");
					break;
					
				}
				else if(arr[i]== "stop") {
					break;
					
				}
					
				}
			
			
			

		}

	}

}
