package exam.vehicle;

public class Car extends Vehicle {
	int speed;
	String color;
	String model;
	
	public Car(String name, int count, int speed, String color, String model) {
		super(name, count);
		this.speed = speed;
		this.color = color;
		this.model = model;
	}
	
	public static class CarBuilder{
		String name;
		int number;
		int speed;
		String color;
		String model;
		
		public CarBuilder(String name, int number) {
			this.name = name;
			this.number = number;
		}
		
		public CarBuilder withSpeed(int speed) {
			this.speed = speed;
			return this;
		}
		
		public CarBuilder withColor(String color) {
			this.color = color;
			return this;
		}
		
		public CarBuilder withModel(String model) {
			this.model = model;
			return this;
		}
		
		public Car build() {
			return new Car(name, number, speed, color, model);
		}
	}
	
	

	@Override
	public void drive() {
		super.drive();
		System.out.println(name + " 자동차가 " + speed + "km 속도로 달립니다.");
		System.out.println("현재 " + color +"의 " + model + " 모델을 사용하고 있습니다.");
	}
	
	

}
