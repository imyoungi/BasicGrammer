package OOP01;
/* 접근 제한자 
 * 클래스(객체) 멤버에 대한 접근을 제한하는 키워드 
 * public : 접근 제한 없음
 * protected : 상속 + default 
 * default : 선언 안하면 default, 동일한 패키지 범위까지 접근가능 
 * private : 클래스 내부에서만 접근가능 
 *           멤버에는 직접 접근 불가 --> 그럼 값을 수정 할 수 없나? 
 * 이때 필요한 것이 getter (값 설정하는 메서드), setter (값 반환하는 메서드)
 * 
 */

public class Point {
	private int x = -1;
	private int y = 0; // 직접 초기화
	

	public void setX(int n) {
		x = n;
	}

	public void setY(int n) {
		y = n;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	{
		System.out.println("초기화 블록");
		x=1;
		for(int i=0;i<10;i++) {
			y+=x;
		}
	}


	Point(){
		System.out.println("디폴트 생성자 ");
		x=0;
		y=0;
	}

	Point(int n1, int n2) {
		System.out.println("오버라이딩 된 생성자(int, int)");
		x = n1;
		y = n2;

	}

	String pointToString() {
		return "(x=" + x + ",y=" + y + ")";
	}

}
