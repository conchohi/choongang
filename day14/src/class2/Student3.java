package class2;

public class Student3 {
	//#1. 필드
	String name;
	int age;
	int score;
	//#2. 생성자 - 생성자 오버로딩(이름이 같고 매개변수 타입이 다르거나,
	public Student3() { 
//		this(); 자신 객체의 생성자 호출
		this("홍길동", 25, 85);
	}
	public Student3(int score) { 
		this("김자바", 25, score);
	}
	public Student3(String name, int score) { 
		this(name, 25, score);
	}
	public Student3(String name, int age, int score){ 
		this.name = name;
		this.age = age;
		this.score = score;
		
	}
	
	//#3. 메소드
}
