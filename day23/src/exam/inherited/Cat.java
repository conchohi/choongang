package exam.inherited;

public class Cat extends Animal{
//	String name;
//	int age;
	
	public Cat(String name, int age) {
		super(name,age);
//		this.name = name;
//		this.age = age;
	}
	
	@Override
	public void cry() {
		System.out.println(name + "가 야옹야옹");
	}

	@Override
	public String toString() {
		return "이름 = " + name + ", 나이 = " + age;
	}
	
}
