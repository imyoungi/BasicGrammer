package OOP07_Interface;

public class Computer extends BigThing implements NotFold {
	@Override
	void email() {
		System.out.println("Send PC Mail");
	}
	@Override
	void memo() {
		System.out.println("Write PC Memo");
	}
	void hdd() { // 고유기능
		System.out.println("Change Hdd");
	}
	@Override
	public void DoNotFold() {
		System.out.println("Computer is NotFold");
		
	}

}
/*
 * extends BigThing을 하면 오류가 난다
 * 왜? 클래스를 만든다는 것이 객체를 만들겠다는 얘기이다
 * 그런데 내 부모는 정의된 것이 없다
 * 그럼 뭘 만들겠다는거냐? 못 만들어
 * 이 오류의 뜻은 자식부분은 정의가 됐는데 BigThing(부모)가 
 * 가지는 특징이 정의가 안됐어 그러니까 정의를 하던지 자식에서 재정의해 
 * 우리는 부모를 정의하는 걸로 해보자 ! 
*/
