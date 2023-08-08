package ThreadEx;

/*
 * 이번에는 Runnable이라는 인터페이스를 이용하자
   Runnable은 run이라는 메서드 하나만 정의되어 있음
   상속을 이미 받고 있다면 다중상속이 불가하니 인터페이스를 구현해서 쓰잖아?
   
*/
public class ThreadB implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("ThreadB : " + i);
			
			//이런 경우 어떻게 메인에서 구현할까? 

		}
	}
}
