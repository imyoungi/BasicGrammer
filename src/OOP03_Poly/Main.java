package OOP03_Poly;

public class Main {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.email();
		com.memo();
		com.hdd();//컴퓨터 고유기능 
		Notebook note = new Notebook();
		note.email();
		note.memo();
		note.fold();//노트북 고유기능 
		Phone pho = new Phone();
		pho.email();
		pho.memo();
		pho.call();//폰 고유기능 
		
		/*
		 *지금 이 세가지를 한번에 관리 할 방법은 없었으나 
		 *다형성의 특징으로 3개의 객체를 하나의 타입(ElectDevice)으로
		 *묶을 수 있음! 
		 */
		
//		ElectDevice[] dev = new ElectDevice[] {
//				com, note, pho
//		};
		

	}

}
