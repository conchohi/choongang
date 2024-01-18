package bookexam;

public class Car {
	String model;
	String color;
	int speed;
	
	public Car() {
		this("그랜져");
	}
	public Car(String model) {
		this(model,"노랑",20);
	}
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
	public void printCar() {
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("속도 : " + speed);
	}
}
