package exam.inherited;

public class Bird extends Animal {

	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void cry() {
		System.out.println(name + "가 짹쨱");
	}
	

}
