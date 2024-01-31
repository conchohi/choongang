package exam.animal;

public class Bird extends Animal implements Flyable {

	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println(name + "가 멀리 날아간다.");
	}

}
