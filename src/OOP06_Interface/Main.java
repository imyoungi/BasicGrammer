package OOP06_Interface;

public class Main {

	public static void main(String[] args) {
		Computer com = new Computer();
		Notebook note = new Notebook();
		Phone pho = new Phone();
		
	/*
	 * 그럼 이제 Bigthing, NeedCase 타입으로 이렇게 묶을 수 있다. 
	 */
	
		BigThing[] big = new BigThing[] {
				note, com
		};
		
		NeedCase cases = pho;
		
		ElectDevice[] dev = new ElectDevice[] {
				com, note, pho
		};
		
		ElectDevice[] dev2 = new ElectDevice[] {
				big[0], big[1], pho
		};
		
		for(int i=0;i<dev.length;i++) {
			dev[i].email();
			dev[i].memo();
			/*
			 * ElectDevice dev = new ElectDevice(); 추클래스이므로 인스턴스 생성불가 
			 * ElectDevice는 추상 클래스이지만, 모두 각각 재정의 되어있으니,
			 * 재정의된 기능이 동작한다.
			 */
			if(dev[i] instanceof Notebook) {
				Notebook tmp = (Notebook)dev[i];
				tmp.fold();
			}
			/*
			 * 이렇게 클래스가 2개 이상이 나왔을 때, 
			 * 관계를 봤더니 컴퓨터에서 BigThing을 참조하는 
			 * 컴퓨터가 BigThing의 참조변수를 갖는 관계 : has~a 관계
			 * 
			 * 그런데 반대로 컴퓨터랑 노트북 같이 약간 비슷한 것도 있고 
			 * 애들을 묶어서 ElectDevice로 묶어주니까 
			 * 노트북/컴퓨터 is ElectDevice? 성립이 되네
			 * 이런 경우, 상속을 사용해도된다. 
			 * 이런 관계를 is~a 관계라고 한다.  
			 * 
			 * 중요) 관계가 있어야 지금처럼 하나로 묶어 관리하는 것이 의미가 있다.
			 * 관계가 없는 것끼리 묶으면 오히려 사용이 어렵고 관리 어려움 
			 * 따라서 클래스를 설계 할땐 관계를 잘 생각해서 지금처럼 상속으로 표현해서 사용할 수 있도록하자  
			 *
			 *그런데 여기서 또 컴퓨터랑 폰이 뭔가 공통점이 있어
			 *그래서 이 둘을 묶어보고 싶어서 묶고 공통 특징 정의한 거 상속 가능? ==> 불가
			 *
			 *             - NeedCase - phone
			 * ElectDevice
			 *             - BigThing - computer
			 *                        - notebook
			 * 
			 * 이런 관계인데, 자바에서는 일자 상속밖에 안된다!
			 * 이유) 
			 * class A
			 * Class b extends class A / Class C extends class A
			 * Class D extends class B
			 * Class D extends class C
			 * 
			 * 이런 경우, D객체를 만드면 어떻게 생성되느냐
			 * A
			 * B
			 * A
			 * C
			 * D 이렇게 만들어진다.
			 * 그럼 A.을 사용할 때 어느 A의 것을 부를것인가?
			 * B,C에서 재정의 됐다면? 그중 어느 것을 사용할 것인다.==모호
			 * 따라서 다중속을 하지 못하도록 하는 것이다.
			 * 
			 * 지금 문제는 A가 클래스이기 때문에 정의된 내용이 여러개 일 수 있어 문제인 것이다 
			 * 그럼 클래스가 아니고 아무 것도 정의 안되면 어떨까? 추상적이고 타입만 있는 것 
			 * 
			 * 결국, 사용하기 위해서는 재정의를 해야한다.
			 * 재정의를 했다는 것은 그거 하나만 쓰겠다는 것이지 
			 * 2개 이상 겹치고 그럴 일 없잖아 
			 * 
			 * 그래서 자바에서는 이미 상속받아져 있는데 어떤 다른 특징들과
			 * 동시에 필요한 타입이 만들어져야 한다면 인터페이스라는 것을 사용 
			 * 
			 * 
			 */
	
		}

	}

}
