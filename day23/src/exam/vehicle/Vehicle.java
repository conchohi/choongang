package exam.vehicle;

public abstract class Vehicle {
	String name;
	int count;
	
	public Vehicle(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public void info() {
		System.out.println(name + "입니다. " + name + "가 " + count + "대 있습니다.");
	}
	
	public void drive() {
		System.out.println(name + "가 주행중입니다.");
	}
	
}
