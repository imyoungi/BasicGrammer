package OOP02;

public class Point {
	private int x = -1;
	private int y = 0; // 직접 초기화

	Point(/* Point this */) {
		System.out.println("디폴트 생성자 ");
		x = 0;
		y = 0;
	}

//	Point(int n1, int n2) {
//		System.out.println("오버라이딩 된 생성자(int, int)");
//		x = n1;
//		y = n2;
//
//	}
	Point(/* Point this */int x, int y) {
		System.out.println("오버라이딩 된 생성자(int, int)");
		this.x = x;
		this.y = y;

	}
	/*
	 * 포인트 생성자 2개 중에 파마리터를 가지는 생성자 경우, 값이 int n1, int n2를 x,y로 명확히 이해가 될까? 완벽하게
	 * x,y라고 보장할 수 없음 애초에 x=x,y=y 라고 적으면 되지 않나? 콘솔) 오버라이딩 된 생성자(int, int) (x=-1,y=0)
	 * 
	 * 10과 20으로 셋팅을 했는데..?
	 * 
	 * 일단 객체 변수가 아무리 많이 heap영역 만들어진다고 하더라도 메서드는 코드이기 때믄에 하나만 만들어진다 참조 변수는 각자 것을
	 * 사용하겠지만, 메서드는 하나를 놓고 같이 쓴다 반대로 메서드 입장에서는 po1이 호출했다면 po1의 x,y를 사용해야한다 이 떄 사용하는
	 * 것이 this!(main으로 이동 )
	 * 
	 * /* 결국 x = x의 의미 int x(-1)을 x에 담아라 밖에 되지 않는다는 것 매개변수x와 멤버변수x가 구분이 안되기 때문 따라서 x
	 * 앞에 this 를 붙여주면 Point this라고 이미 전달이 되어지니 그 전달 받은 this의 x, this의 y라고 하면 구분이 된다.
	 * 매개변수x의 값을 현재 이 생성자를 호출한 객체의 x에 담아라
	 */

	String pointToString(/* Point this <-- 이런 식으로 전달 */) {
		System.out.println("나를 호출한 객체 " + this);
		// 이렇게 했을 때, pointToStrin을 누가 호출했는지 알려준다
		return "(x=" + x + ",y=" + y + ")";
	}

	public void setX(int x) {
		this.x = x;

	}
	public void setY(int y) {
		this.y = y;
	}
	/*
	 * setter도 위와 같이 사용하면 편리하고 명확함
	 * 이 x값을 누구한테 셋팅하면 되는거야? 그거 지금 호출한 변수에!   
	 */
	public int getX(/* Point this */) {
		return this.x;
	}
	public int getY(/* Point this */) {
		return this.y;
	}
	/*
	 * getter 같은 경우, 굳이 명시하지 않아도 이런 식으로 값 호출함 
	 */

}
