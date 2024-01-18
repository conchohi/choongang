package class2;

public class CarMainExam {

	public static void main(String[] args) {
		//#1. Car 클래스를 이용해서 객체를 생성
		Car car = new Car();
		Car car1 = new Car();
//		Car car2 = new Car();
		
		//#2. 객체 사용
		System.out.println("car.company : " + car.company);
		System.out.println("car.model : " + car.model);
		System.out.println("car.color : " + car.color);
		System.out.println("car.maxSpeed : " + car.maxSpeed);
		System.out.println("car.speed : " + car.speed);
		
//		System.out.println("메소드 실행 : " + car.show()); //반환값 없으면 사용 X
		car.show();
		System.out.println();
		
		car.company = "삼성자동차";
		System.out.println("car.company : " + car.company);
		car.speed = 100;
		System.out.println("car.speed : " + car.speed);
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println("car1.speed : " + car1.speed);
	}

}
