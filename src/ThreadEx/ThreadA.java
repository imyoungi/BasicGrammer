package ThreadEx;
//Thread를 상속받고, run이라는 메서드를 오버라이딩한다 
public class ThreadA extends Thread {
	
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("ThreadA : "+i);
		}
		
	}

}
/*
 * 자바에서 스레드를 추가하고 싶을 때,
 * 특정기능을 가지는 클래스에 대해서 스레드를 상속해서 만들고
 * run이라는 메서드를 오버라이딩 하면 얘가 추가 작업 스레드가 된다.
 * 
 * 메인 스레드와 동시에 작업할 수 있게 된다.
 * 어떻게 동작하냐면! 메인으로 이동  
 * 
*/
