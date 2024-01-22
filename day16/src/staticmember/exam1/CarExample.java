package staticmember.exam1;

public class CarExample {

	public static void main(String[] args) {
		//#1. 객체 생성
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
		
//		myCar.setSpeed(10); //private 메서드
//		yourCar.setSpeed(10); //private 메서드
		
		
	}

}
