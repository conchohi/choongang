package class2;

public class Student2 {
	//#1. 필드
	String name;
	int age;
	int score;
	
	//#2. 생성자 - 생성자 오버로딩(이름이 같고 매개변수 타입이 다르거나,
	public Student2() { //기본 생성자
					//기본 생성자는 다른 생성자가 하나라도 있으면 컴파일러가 자동으로 생성 X
					//따라서 생략하면 안됨
		
	}
	
	public Student2(String name, int age, int score) {
		this.name = name; //this - 자신의 객체
						  //this.name : 필드
		this.age = age;
		this.score = score;
	}
	
	//#3. 메소드
}
