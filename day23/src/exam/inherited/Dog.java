package exam.inherited;

public class Dog extends Animal{
	String name;
	int age;
	
	public Dog(String name, int age) {
		super(name,age);
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "가 자고 있다.");
	}
	
	@Override
	public void cry() {
		System.out.println(name + "가 멍멍!");
	}

	@Override
	public String toString() {
		return "이름 = " + name + ", 나이 = " + age;
	}
	
}
