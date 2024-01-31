package exam.inherited;

public abstract class Animal {
//	public void cry() {
//		System.out.println("동물 울음소리");
//	}
	
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("부모의 것");
	}
	public abstract void cry();
}
