package Object;

class TestB {
	int a;

	void MethodA() {
		System.out.println("TestA 기능 " + 1);
	}

	public String toString() {
		return "TestA[a=" + a + "]";
	}

	/* #2 */
	@Override
	public int hashCode() {
		final int prime = 31; // 기준 값 
		int result = 1;
		result = prime * result + a;
		/*
		 * 정해진 값=고정된 값에 지금 a만 들어간 상황
		 * 동일한 수식에 동일한 값이 들어가면 동일한 결과가 나옴
		 * 분명 다른 객체이기 때문에 해시코드로 다르게 취금하기 위함이였는데 
		 * 이 수식(오버라이딩)을 통해 객체가 가지고 있는 값이 동일하다면, 해시코드 값도 동일하게 셋팅할 수 있음
		 * 객체가 가지고 있는 값이 동일하다면, 해시코드가 다르더라도 하나로 취급할 수 있음  
		 *
		 */
		
		return result;
	}

	/* #1 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //나랑 전달받은 obj가 동일하니? 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 클래스 정보 비교 
			return false;
		TestB other = (TestB) obj; // 다운캐스팅해서 참조를 더 넗혀보는 것 
		if (a != other.a) // equals를 호출한 a와 전달받은 객체 a를 비교  
			return false;
		return true; // 같다면 내부 멤버 객체는 같은 값! 
	}
	
	

}

public class ObjectEx02 {

	public static void main(String[] args) {
		TestB oba1 = new TestB();
		oba1.a = 10;
		TestB oba2 = new TestB();
		oba2.a = 10;

		Object obj1 = oba1;
		Object obj2 = oba2;
		// 부모로 참조! 업캐스팅

		System.out.println(obj1);
		System.out.println(obj2);
		/*
		 * 이 결과는? ToString과 동일(그렇게 내부 작동함) 이런 걸 어디에 쓸 수 있을까? 객체정보를 설명할 수 있음 이상한 해시코드로 말고
		 * toString을 오버라이딩해서 사용 가능
		 */

		System.out.println(obj1 == obj2); // 같은 객체이냐? 
		System.out.println(obj1.equals(obj2));
		/*
		 * 같은 값을 가지고 있다고 같은 객체는 아니다
		 * equals가 ==로 표현되어 있음 
		 * 그럼 객체와 객체의 내부 멤버 값을 비교하고 싶다면?
		 * 오버라이딩 필요! #1
		 */
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		/*
		 * hashCode는 객체를 식별하는 값 디버깅할 때 아이디
		 * 객체 별로 모두 다른 값 그런데 다른 객체인데 같은 값을 가지고 있다면
		 * 뭐하러 객체를 따로 만들어? 하나만 있으면 된다! 라고 판단할 수 있음 
		 * 중요) 동일한 값을 가지는 객체를 하나로 취급하고 더 이상 만들지 않거나 버리거나 하고 싶을 때! 
		 * 이때도 오버라이딩해서 사용하면 활용 쉬워짐 #2 
		 *  
		 */
		

	}

}
