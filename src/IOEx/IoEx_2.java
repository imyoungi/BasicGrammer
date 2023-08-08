package IOEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IoEx_2 {

	public static void main(String[] args) {
		File file = new File("data");
		
		System.out.println(file.length());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.getAbsolutePath());

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);
			//입력할 수 있는 빨대를 꽂고! 
			int data = 0;
		    while((data = fis.read()) !=-1) { // EOF
			System.out.print ((char)data);
		}
		    
		    /* 1byte(한 커서씩 이동하며)읽어서 fis에 넣고 반복하다 데이터가 없음 -1을 반환! 반복문 빠져나온다 
		     * 
		     * 아래처럼 반복해서 코드를 적는 것은 불가함 -> 몇번 반복하는지 알 수 없음
		     * 따라서 -1(파일의 끝 :End of File) 일 때까지 반복해서 읽음 
		     * 
		     * 만약 한글이 있다면? 1byte로 표현할 수 없기 때문에 이상하게 표기됌 
		     */
//			int data = fis.read();
//			System.out.println((char)data);
//			//1byte를 읽고 data에 담아서 출력해라 
//			
//			
//			 data = fis.read();
//		     System.out.println((char)data);
//		     
//		     data = fis.read();
//		     System.out.println((char)data);
//		     
//		     data = fis.read();
//		     System.out.println((char)data);
//		     
//		     data = fis.read();
//		     System.out.println((char)data);
//		     
//		     data = fis.read();
//		     System.out.println((char)data);
//		       
//			

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO: handle exception
				}
				/*
				 * 결과는 65
				 * 왜? 내가 data라는 파일에 'A'를 입력해놓았기 때문
				 * 근데 왜 ABCDEFG라고 바꿔도 A가 출력이 될까?
				 * 얘가 몇번 읽는지 어떻게 알아,,,!!
				 * 
				 * data = fis.read();
		           System.out.println((char)data);
			       
			       반복하면 순서대로 나옴 
				 * 근데,, data라는 곳에 문자가 아닌 문장이 있다면? 
				 * 그 문장들을 읽ㅇ서 어디에 써야 한다면 어떻게 해야할까?
				 * 
				 * 한 글자씩 출력하는데 문자 수를 셀거여? 
				 * 물론 file클래스에서 제공하는 정보들이 있음(길이, 절대경로 등등)  
				 * 
				 * 보통은 반복을 시켜서 모든 문자를 읽는다!
				 * 
				 * 
				 * 
				 */
			}

		}

	}
}
