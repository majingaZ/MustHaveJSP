package common;

public class Person {
	private String name;
	private int age;
	
	public Person() {	} // 기본 생성자

	public Person(String name, int age) { // 생성자
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() { //사용을 위한 get, set 메서드
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
	
}