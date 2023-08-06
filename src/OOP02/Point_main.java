package OOP02;

public class Point_main {

	public static void main(String[] args) {
		Point po1 = new Point(10, 20);
		Point po2 = new Point(30, 40);
		System.out.println(po1);
		// OOP02.Point@3f8f9dd6-->객체 식별값 출력
		System.out.println(po2);
		// OOP02.Point@aec6354 --> 서로 다른 값 출력
		System.out.println(po1.pointToString(/*po1*/)); //사실 이렇게 시스템 내부적으로 참조변수를 전달함    
		System.out.println(po2.pointToString(/*po2*/));
		//초기 셋팅으로만 되어있고 바뀌지 않음 (pointToString로 이동)

	}

}
