package OOP07_Interface;

public class Main {

	public static void main(String[] args) {
		Computer com = new Computer();
		Notebook note = new Notebook();
		Phone pho = new Phone();

		NotFold[] nf = new NotFold[] { com, pho };
		// 이런 식으로 묶어줄 수 있다!

		for (int i = 0; i < nf.length; i++) {
			nf[i].DoNotFold();
		/*
		 * 서로 전혀 관계 없는 타입인데..! 이렇게 하나로 묶고 관계 형성 가능 
		 */
			
		}
	}
}