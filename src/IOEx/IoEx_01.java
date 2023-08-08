package IOEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoEx_01 { 

	public static void main(String[] args) {
		File file = new File("data");
		/*
		 * 자바에서 제공하는 file 이라는 클래스를 이용해서
		 * data라는 이름의 파일을 객체로 생성
		 */
		
		FileOutputStream fos = null;
		/*
		 * Stream -> 흐름을 이야기한다 
		 * 메모리 -> 모니터 : 프로그램을 실행 시켰을 때, 모니터에 보여짐(데이터가 나가는 것) -Output  
		 *      <- 키보드 : 프로그램쪽으로 들어오는 것 -> Input 
		 * Stream : 왔다갔다하는 흘러가는 통로 
		 * 파일로 출력하기 위한 흐름이라는 개념
		 */
		

		try {
			fos = new FileOutputStream(file, true);
			/*
			 * FileOutputStream 이 클래스로 객체를 생성할 때,
			 * 어떤 file로 출력할거냐 해서 file을 전달한 것
			 * 메모리 -> HDD 어딘가에 있는 파일(file)
			 * 그 파일에 출력하는 흐름 하나를 만든 것 (빨대를 꼽았다!) 
			 * 메모리에서 파일로 데이터가 나가는 거지~(방향) 
			 * 
			 * fos = new FileOutputStream(file , true/false);
			 * 뒤에 boolean 값을 줄 있음
			 * true -> 기존의 파일이 있을 경우, 추가해서 쓰겠다(이어쓰기) 
			 * false -> 기존의 파일이 있을 경우, 새로 쓰겠다 
			 */
			fos.write(65);
			//계속 추가하면 여러개 출력된다! 
			fos.write(66);
			fos.write(67);
			fos.write(68);
			
			/*
			 * 자바에서 입출력을 위한 클래스
			 * 
			 * ~Stream : 1byte 단위로만 읽어들임 
			 * 데이터가 전송, 복사 될 때,byte단위로 동작 
			 * 
			 * ~Reader / ~Writer : 채팅같은 문자가 필요한 경우
			 * 얘네들을 사용, 2byte 단위로 입출력 
			 * 2byte를 사용하는 char형이 default 
			 * 
			 * 
			 * public void write(int b) write는 int으로 데이터를 받음 
			 * int형이지만! 1byte형으로 표현이 못하면 의미를 잃어버림 
			 * 
			 * 
			 */

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				/*
				 * fos 참조변수가 null이 아니면, 즉 객체가 참조되고 있다면
				 * 해당 스트림을 fos.close(); close해라.
				 * 닫지 않는 경우, 어떻게 될까?
				 * 빨대를 꽂았는데, 프로그램만 종료? ->운영체제는 아직 사용 중으로 인식 
				 * 자주 보는 "열러있어 저장할 수 없습니다" 문제 발생
				 * 반드시 마지막에는 닫아주자! 
				 * 
				 */
				try {
					fos.close();
				} catch (IOException e) {
					// TODO: handle exception
				}
			}

		}

	}
}
