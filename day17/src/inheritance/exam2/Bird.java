package inheritance.exam2;

public class Bird extends Animal {
	
	//# 새들만의 특징
	
	public void fly() {
		System.out.println("새가 날고 있다.");
	}
	
	@Override
	public void cry() {
		super.cry();
		System.out.println("즐거운 시간~~");
		System.out.println();
	}
}
