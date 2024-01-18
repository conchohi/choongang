package class2;

public class Car1 {
	//#1. 필드(=멤버변수, 인스턴스 변수)
	String company = "현대자동차";
	String model;
	String color;
	int speed;
	
	
	//#2. 생성자
	public Car1() { //초기화 내용, 유효성 검사, 없을 시 생략 가능
		super(); //부모의 기본생성자를 호출 (생략 가능) -> 묵시적 호출
		model = "소나타";
		color = "빨강";
	}
	
	//#3. 메소드
//	public void showInfo(int speed, String color) {
//		this.speed = speed;
//		this.color = color;
//	}
}
