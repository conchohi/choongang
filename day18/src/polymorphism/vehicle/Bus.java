package polymorphism.vehicle;

public class Bus extends Vehicle{
	String color;
	String name;
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void show() {
		System.out.println("버스의 이름 : " + name);
		System.out.println("버스의 색상 : " + color);
	}
	
}
