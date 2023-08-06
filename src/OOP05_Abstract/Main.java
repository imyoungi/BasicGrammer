package OOP05_Abstract;


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
		 *지금 이 세가지를 한번에 관리 할 방법은 없음
		 *각각의 기능들은 관리 할 수 없더라도 공통 기능을 한클래스에 정의하고
		 *그걸 상속 받으면 어떻게 될까? 
		 */
		
		ElectDevice[] dev = new ElectDevice[] {
				com, note, pho
		};
		
		for(int i=0;i<dev.length;i++) {
			dev[i].email();
			dev[i].memo();
			/*
			 * 이렇게 되면 한타입으로 객체를 관리 할 수 있음 ==> upcasting 발생 
			 * 고유의 기능은 사용할 수 없음 ElectDevice으로 볼 수 있는 메서드는 email(),memo()
			 * notebook의 모든 기능이 없는게 아니다 ElectDevic은 ElectDevic까지만 볼 수 있는 것 
			 * 이 반대 개념이 다운 캐스팅 
			 * 만약 형변환을 해서 다른 메서드도 쓰고 싶다면 
			 */
			if(dev[i] instanceof Notebook) {
				Notebook tmp = (Notebook)dev[i];
				tmp.fold();
			}
			/*
			 * tmp라는 새로운 참조변수를 만들어서 ElectDevice부분 + 고유기능까지 보겠다! 
			 */
	
		}

	}

}
