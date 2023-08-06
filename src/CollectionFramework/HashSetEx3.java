package CollectionFramework;

import java.util.HashSet;

public class HashSetEx3 {
	/*
	 * HashSet은 중복을 허용하지 않는다고 하지만 기본 타입 외의 데이터들을 어떻게 중복 제거를 하는가?
	 */

	public static void main(String[] args) {
		HashSet<Info> infos = new HashSet<>();

		Info info1 = new Info("이삭", 5);
		Info info2 = new Info("이사야", 3);
		Info info3 = new Info("이삭", 5);
		Info info4 = new Info("이사라", 0);

		System.out.println(info1 == info3);
		// 동일한 값이나, 같은 객체는 아님

		infos.add(info1);
		infos.add(info2);
		infos.add(info3);
		infos.add(info4);

		for (Info info : infos) {
			System.out.println(info);
		}
		/*
		 * 결과 info [name=이삭, age=5] info [name=이사라, age=0] info [name=이삭, age=5] info
		 * [name=이사야, age=3]
		 * 
		 * 중복을 허용하지 않는다고 했는데?? 이걸 해결해보자
		 * 
		 * Info 클래스로 이동! 
		 * 
		 * hashCode 
		 * hashCode 
		 * hashCode 
		 * hashCode 라는 결과를 보았을 때, 알 수 있는 사항은
		 * 데이터를 추가(add)할 때, hashCode를 호출하고 있다 결과적으로 해시코드가 같으면 같은 객체로 판단하려고 하는구나!
		 * Integer, String 같은 경우 이미 오버라이딩 되어 있어서 값이같으면 해시코드를 동일하게 가진다. 하지만 우리가 만든
		 * info클래스 같은 경우, 지금 같은 값이여도 다른 해시코드 값을 가지는 상황
		 * 
		 * 그럼 해시코드값 + age 값으로 고유한 값을 만들어보자 Info 클래스로 이동!
		 * 
		 * 
		 * infos.add(info1); //hashSet에 들은 게 없어 비교 안됌, 해시코드 출력 
		 * infos.add(info2); //해시코드 출력 
		 * infos.add(info3); //해시코드 출력 엇? 같은 거 같은데? 
		 * infos.add(info4); 세번째 해시코드까지 출력했는데, 같은 해시코드 값이 있다! 엇 같은 객체 같은데? 라고 판단 그래서 하나 더 확인, 
		 * 아래 equals 메서드 실행 엇 그런데 다른 객체라서 info [name=이삭, age=5]를 저장한 것 근데 사실은 같은 데이터니까 저장을 하면 안되니... equals에서도
		 * 같은지 판단할 수 있게 오버라이딩 해줘야함
		 * 
		 * 결과 
		 * hashCode 
		 * hashCode 
		 * hashCode 
		 * equals 
		 * hashCode
		 * 
		 * 
		 * 
		 * @Override
		 * public boolean equals(Object obj) { 
		 *     System.out.println("equals");
		 *     Info tmp = (Info)obj; 
		 *     if(name.equals(tmp.name) && age == tmp.age) { 
		 *         return true; 
		 *      } 
		 *      return false;
		 * 
		 * 
		 * hashCode 
		 * hashCode 
		 * hashCode 
		 * equals 
		 * hashCode 
		 * info [name=이사라, age=0] 
		 * info [name=이사야, age=3] 
		 * info [name=이삭, age=5]
		 * 
		 * 해시코드 비교 후 equals로 데이터까지 비교 후, 같은 객체로 판단 후 저장하지 않음
		 * 
		 *  
		 * 최종정리) Collection에 저장할 클래스가 Wrapper(Integer, String 등등)클래스가 아닌 경우
		 * Hash를 사용하는 클래스는 객체를 판별하기 위해 다음과 같이 동작한다
		 * 
		 * 1) 객체의 hashCode() 결과를 비교, 아니면 다른 객체이다
		 * 2) 같으면 equals() 결과를 비교, 아니면 다른 객체이다
		 * 
		 * public boolean equals(Object obj)
		 * 기본적으로 존재하는 Object클래스의 equals메서드는 toString()값을 비교함
		 * Custom class의 내부 값을 비교하기 위해 오버라이딩 
		 * 
		 * public int hashCode()
		 * Custom class로 만들어진 객체 자체를 구분하기 위해 오버라이딩 
		 * 
		 * 결론!!
		 * equals()를 재정의 하는 경우, hashCode()역시 객체 자체의 값을 반환하도록 재정의
		 * Custom class는 equals(),hashCode(),toString()을 적절히 재정의 
		 *  
		 */

	}

}
