package OOP01;

public class Point_main {

	public static void main(String[] args) {
		Point po1 = new Point();
		Point po2 = new Point(10,20);
		
		System.out.println(po1.pointToString());
		System.out.println(po2.pointToString());
		
		po1.setX(11);
		po1.setY(21); // 이렇게 po1값을  원하는 값으로 셋팅 
		
		System.out.println(po1.getX());
		System.out.println(po1.getY()); // po1를 통해  값을 가져오기
		
		/*
		 *  정리
		 *  객체 초기화 하는 방법 3가지
		 *  1) 직접 초기화 x=1, y=1 
		 *  2) 블록 초기화 {} 안에서 초기화
		 *  3) 생성자 초기화(중요!!)
		 *  우리는 이미 객체를 생성을 하면서 생성자를 만들지 않았지만 자동으로 호출하고 있었음
		 *  = new Point(); --> 디폴트 생성
		 *  = new Point(10, 20) --> 오버로딩하여 값을 받을 수도 있음 
		 */

	}

}
