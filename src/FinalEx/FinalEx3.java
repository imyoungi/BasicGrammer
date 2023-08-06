package FinalEx;

class Test3 {
	final void method1() { // 자식에서 재정의 불가
	}

	void method2() {

	}
}

class Test3sub extends Test3 {
//	void method1() {}
//	Cannot override the final method from Test3
	void method2() {

	}
}

public class FinalEx3 {

	public static void main(String[] args) {
		
	}

}
