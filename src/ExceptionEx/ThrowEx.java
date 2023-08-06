package ExceptionEx;

import java.io.IOException;

public class ThrowEx {

	public static void main(String[] args) {

	
			try {
				int n = System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		/*
		 * int n = System.in.read(); 키보드로 1바이트를 읽어들이는 메서드 오류가 나는 이유? 자바문서 참고) public
		 * abstract int read() throws IOException
		 * 
		 * throws라는 키워드가 함께 쓰인다라고 나옴 read()사용 시 IOException라는 예외가 발생할 수 있어 //이게 throws의
		 * 역할 (예외전가) 그런데 read()에선 이 문제를 처리하고 있지 않아 그러니까 이 예외가 던져질 거니까 try, catch로 미리
		 * 대비해놓아야 한다!
		 * 
		 * 
		 * Class IOException
		 * 
		 * java.lang.Object java.lang.Throwable java.lang.Exception // 여기까지 상속 받은 얘들은
		 * 컴파일 때 예외처리를 해주어야 java.io.IOException
		 * 
		 * 
		 * Class InputMismatchException java.lang.Object java.lang.Throwable
		 * java.lang.Exception java.lang.RuntimeException
		 * // 실행 중에 발생할 수 있는 예외다! 그래서 컴파일할 때는 try~catch 하지 않아도 된다.
		 * java.util.NoSuchElementException
		 * java.util.InputMismatchException
		 * 
		 * 
		 * 따라서 int n = System.in.read();를 사용하려면
		 * 1) add throws declaration(ThrowEx2로 이동)
		 * 2) surronud with try/catch -- 단순 try/catch문
		 * 
		 * 
		 * 
		 * throw : 예외객체를 catch로 전달하는 구문
		 * throws : 해당 메서드에서 발생되는 예외 클래스를 선언(예외처리가 아닌 전가)
		 * throws가 선언된 메서드를 사용하는 클래스에서 예외처리 필요  
		 */

	}


