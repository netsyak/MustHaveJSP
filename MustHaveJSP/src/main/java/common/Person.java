package common;

public class Person {
	private String name;
	private int age ;
	
	public Person() {
	
	}
	//생성자 (인수들을 받아 모든 속성을 초기화해주는 생성자9)
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//GET/SET 메서드
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

	
}
