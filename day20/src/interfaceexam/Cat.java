package interfaceexam;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override //재정의 - 부모의 것을 고쳐 사용
	public void cry() {
		System.out.println("야옹~~");
	}

}
