package interfaceexam;

public abstract class Animal {
	//#1. 필드 - 인스턴스 필드
	String name;
	int age;
	
	//#2. 생성자
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//#3. 일반 메소드 - 완성 메소드 { }이 있으면 완성 메소드
	public void showInfo() {
		System.out.println("추상 클래스입니다.");
	}
	
	//#4. 추상 메소드 - 미완성 메소드 ( { } = body 가 없음)
	public abstract void cry();
}
