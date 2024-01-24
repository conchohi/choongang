package polymorphism.car;

public class Car {
	//4개의 타이어, 최대 회전수가 6이라면 누적 회전수가 6이 되면 펑크
	private Tire frontLeftTire = new Tire("앞왼쪽", 6); //위치, 최대회전수
	private Tire frontRightTire = new Tire("앞오른쪽", 2);
	private Tire backLeftTire = new Tire("뒤왼쪽", 3);
	private Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//생성자 - 생략되면 기본 생성자 컴파일 시 생성
	

	//메소드 - run() : 4개의 타이어를 한 번씩 1회전 시킴
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		if(!frontLeftTire.roll()) { //frontLeftTire.roll() == false
			stop();//stop 메소드 호출, 펑크이기때문에
			return 1; //해당 위치의 타이어 번호
		} 
		if(!frontRightTire.roll()) {
			stop();//stop 메소드 호출, 펑크이기때문에
			return 2; //해당 위치의 타이어 번호
		}
		if(!backLeftTire.roll()) {
			stop();//stop 메소드 호출, 펑크이기때문에
			return 3; //해당 위치의 타이어 번호
		}
		if(!backRightTire.roll()) {
			stop();//stop 메소드 호출, 펑크이기때문에
			return 4; //해당 위치의 타이어 번호
		}
		return 0; //위 조건이 모두 만족하지 않을 때 리턴 값, 정상일때
	}
	
	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
	public void changeFrontLeftTire(Tire frontLeftTire) {
		this.frontLeftTire = frontLeftTire;
	}
	
	public void changeFrontRightTire(Tire frontRightTire) {
		this.frontRightTire = frontRightTire;
	}
	
	public void changeBackLeftTire(Tire backLeftTire) {
		this.backLeftTire = backLeftTire;
	}
	
	public void changeBackRightTire(Tire backRightTire) {
		this.backRightTire = backRightTire;
	}

}
