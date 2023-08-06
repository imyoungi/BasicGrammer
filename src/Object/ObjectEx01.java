package Object;

/*
 * 자바의 모든 클래스는 Object class 상속 --> 다형성 사용 가능 
 * 최상위 클래스라고 할 수 있음
 * 상속 키워드 없으면 자동으로 추가
 * 주요메서드 )boolean equals(), 
 * String toString(), 
 * int hashCode() 
 * Class getClass() : 클래스 정보를 담은 클래스 반환 
 * 
 */
class TestA /* extends Object*/ {

}

public class ObjectEx01 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		System.out.println(obj1.toString());//어디 클래스에 대란 객체다 라는 정보/ 해시코드 결과 값(16진수) 
		System.out.println(obj1.hashCode());
		System.out.println(obj2.toString());
		System.out.println(obj2.toString());
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));

		TestA oba1 = new TestA();
		TestA oba2 = new TestA();
		TestA oba3 = oba1;
		System.out.println(oba1.toString());
		System.out.println(oba1.hashCode());
		System.out.println(oba2.toString());
		System.out.println(oba2.toString());
		System.out.println(oba1.equals(oba2));
		System.out.println(oba1.equals(oba3));
/*
 * Object클래스로 해당 메서드 사용 가능한 것은 알겠으나
 * 우리가 만들 클래스도 해당 메서드들 사용할 수 있는 이유는?
 * 기본적으로 Object클래스 상속하고 있다! 라는 걸 알 수 있다 
 * 그 말은 Object로 모든 객체를 관리 할수 있다는 말 
 */
	


	}

}
