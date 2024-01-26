package abstract1;

public abstract class Cat extends Animal{
	//#1. 필드
	String name;
	
	//#2. 생성자
	public Cat(String name) {
		//super(); //생략, Animal의 기본 생성자 호출
		this.name = name;
	}
	
	//#3. 메소드
	public void showInfo() {
		System.out.println("Cat 입니다.");
	}
	
}
