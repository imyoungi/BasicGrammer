package OOP05_Abstract;
public abstract class ElectDevice {
   
	abstract void email(); //추상메서드 
    abstract void memo();

}
/*
 * 세상에 전자기기라는 실물객체는 없음 전자기기의 기능 가진 핸드폰, 컴퓨터 등이 있을 뿐 따라서 ElectDevice dev = new
 * ElectDevice(); 할 수 없음 그래서 자바에선 그런 타입을 표현하기 위해 Abstract라는 키워드 사용
 * void 앞에 abstrat 적고, {} 구현부 지워주기 
 * 그리고 이런 추상 메서드를 가지는 클래스는 클래스도 추상 클래스임
 * class앞에 abstrat로 바꿔주기 
 * 단, 모든 메서드를 추상메서드로 가질 필요는 없으나,
 * (중요) abstrat라고 추상 클래스로 되는 순간 인스턴스화할 수 없음
 * 이건 여러 타입을 관리하기 위한 상위타입의 목적이 있을 뿐이지, 객체로 생성해서 뭔가 사용하는 목적이 아님
 * 
 * 보면 이렇게 메서드, 행위를 정의할 수 없기 때문에 ElectDevice는 만들어 질 수가 없음 
 * ElectDevice는 타입(자료형)으로서는 의미가 있으나 인스턴트화 시킬 순 없다
 * 그럼 어디에 쓰이나? 클래스 설계 시에 쓰임 
 */
