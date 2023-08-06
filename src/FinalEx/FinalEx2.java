package FinalEx;

class Test2{
	final int A = 10;
	void method() {
		//A = 20; 불가 
	}
}

public class FinalEx2 {

	public static void main(String[] args) {
	Test2 ob = new Test2();
	// ob.A = 20; 불가 
	System.out.println(ob.A);
	}

}
