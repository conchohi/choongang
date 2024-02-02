package exam01.interface1;

public class Bird implements Countable {
	private String name;
	private int number;
	
	public Bird(String name) {
		this.name = name;
		this.number = (int)(Math.random()*10) + 1;
	}
	
	public void fly() {
		System.out.println(number + "마리 " + name + "가 날아간다.");
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 " + number + "마리 있다.");
	}

}
