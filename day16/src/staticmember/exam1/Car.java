package staticmember.exam1;

public class Car {
	//#1. 필드
	String model;
	int speed;
//	int[] score;
	
	//#2. 생성자 - 클래스 이름과 같음
	public Car() {}
	public Car(String model) {
		this.model = model;	
	}
//	public Car(String model, int num) {
//		this.model = model;
//		score = new int[num];		
//	}
	
	//#3. 메소드
	private void setSpeed(int speed) {
		this.speed = speed;
		return;
	}
	
	public void run() {
		for(int i = 10; i <= 50; i++) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다, (시속 : " +
			this.speed + "km/h)");
		}
	}
	
}
