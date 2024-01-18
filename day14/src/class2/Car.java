package class2;

public class Car {
	//#1. 필드
	String company = "현대자동차"; //초기값 지정  
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed; //자동 초기화
	
	//#2. 생성자 - 생략하면 컴파일러가 컴파일 시 자동으로 생성
	public Car() {}; //기본 생성자
	
	//#3. 메소드
	public void show() {
		System.out.println("자동차 이름 : " + model);
		if(speed >= maxSpeed) {
			System.out.println("속도가 최대치를 초과했습니다.");
			System.out.println("속도를 다시 설정해 주세요");
		}
	}
}
