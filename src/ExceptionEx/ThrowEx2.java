package ExceptionEx;

import java.io.IOException;
/*
 * int input() throws IOException 
 * 이 예외는 발생될 수 있으니, input() 사용할 곳에서 알아서 처리해라!
 * 라고 명시해주는 것 
 * 따라서, mi.input(); 여기서 try/catch 처리 
 */
class MyInput {
	int input() throws IOException {
		int result = 0;
		result = System.in.read();
		return result;
	}
}

	public class ThrowEx2 {
		public static void main(String[] args) {
			MyInput mi = new MyInput();
			try {
				mi.input();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
/*
 * 예외종류
 * 1)Exception(중요도 매우 높음, 치명적)
 *   예외처리 구문이 반드시 필요한 예외
 *   컴파일 시 예외 처리 구문 작성여부 확인 
 *   
 * 2)RuntimeException(요도 높지 않음, 치명적이진 않음)
 *   예외처리 구문이 반드시 필요하지는 않음
 *   실행 중 예외가 발생되면 예외처리 구문을 찾아서 실행 
 * 
 */
