package exam01.abstract1;

public class Bird extends Countable {
	
	public Bird(String name) {
		super(name);
	}
	
	public void fly() {
		System.out.println(getNumber() + "마리 " + getName() + "가 날아간다.");
	}
	
	@Override
	public void count() {
		System.out.println(getName() + "가 " + getNumber() + "마리 있다.");
	}

}
