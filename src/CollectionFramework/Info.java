package CollectionFramework;

public class Info {
	private String name;
	private int age;

	public Info(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "info [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return name.hashCode()+age;
//				super.hashCode();
		//기존 메서드 오버라이딩 
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		//이름과 나이 모두가 같은지 한번 더 확인을 위해서 아래 코드 추가
		Info tmp = (Info)obj;
		if(name.equals(tmp.name) && age == tmp.age) {
			return true;
		}
		return false;
		//return super.equals(obj);
		//기존 메서드 오버라이딩 
		
		//전달받은 Object obj와 같은지 비교 
	}
	
	
	
	

}
