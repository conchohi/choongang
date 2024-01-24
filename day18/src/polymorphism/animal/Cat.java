package polymorphism.animal;

public class Cat extends Animal {
	String name;
	int age;
	
	public Cat(String name, int age) {
		super(); //부모 생성자를 호출, 생략 가능
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.println(name + "의 나이는 " + age + "살");
	}
	
	@Override //어노테이션, 재정의
			  //오버라이딩, 부모의 메소드를 상속받아 자식이 자기에 맞춰 고쳐 쓰기
	public void cry() {
		System.out.println("야옹~~");
	}
}