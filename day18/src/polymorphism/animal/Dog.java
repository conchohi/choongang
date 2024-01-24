package polymorphism.animal;

public class Dog extends Animal {
	String name;
	int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.println(name + "의 나이는 " + age + "살");
	}
	
	@Override
	public void cry() {
		System.out.println("멍멍!");
	}
}