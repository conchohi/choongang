package polymorphism.car;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		
		//car 객체 run 5번 반복 실행
		for(int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1 : //앞왼쪽
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.changeFrontLeftTire(new HangookTire("앞왼쪽",15));
				break;
			case 2 : //앞오른쪽
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.changeFrontRightTire(new KumhoTire("앞오른쪽",13));
				break;
			case 3 : //뒤왼쪽
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.changeBackLeftTire(new HangookTire("앞왼쪽",14));
				break;
			case 4 : //뒤오른쪽
				System.out.println("뒤오른쪽 금호타이어로 교체");
				car.changeBackRightTire(new KumhoTire("앞왼쪽",17));
				break;
			}
			System.out.println("-----------------------------");
		}
	}

}
