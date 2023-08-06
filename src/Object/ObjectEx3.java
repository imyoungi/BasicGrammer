package Object;

/*
 * Object 와 String 다른 부분이 존재함 
 */

public class ObjectEx3 {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = new String("Hell");
		
		System.out.println(str1);
		System.out.println(str2.toString());
		System.out.println(str3);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());// 문자가 같으면 같은 해쉬코드 가짐 
		System.out.println(str3.hashCode());
		
		System.out.println(str1 == str2); // 동일한 객체 아님 
		System.out.println(str1.equals(str2)); // 참조하는 문자열 동일(해시코드가 같기 때문에) 동등한 객체로 판단  
		System.out.println(str1.equals(str3));

	}

}
