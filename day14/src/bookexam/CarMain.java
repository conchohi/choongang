package bookexam;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car car = new Car("아우디");
		Car thisCar = new Car("아반떼", "파랑", 250);
		
		myCar.printCar();
		car.printCar();
		thisCar.printCar();
	}

}
