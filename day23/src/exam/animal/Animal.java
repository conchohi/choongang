package exam.animal;

public abstract class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void cry() {
		System.out.println(name + "가 운다");
		System.out.println(name + "의 나이는 " + age + "살이다.");
	}
}
