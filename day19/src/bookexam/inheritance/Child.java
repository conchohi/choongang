package bookexam.inheritance;

public class Child extends Parent{
	//#1. 필드
	String name;
	
	//#2. 생성자
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}


	public Child(String name) {
		super("홍길동");
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
