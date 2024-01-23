package inheritance.exam2;

public class Dog extends Animal {
	int age = 3;
	
	public Dog(String name) {
		super(name); //부모의 생성자 호출
	}

	//# 강아지만이 가진 기능
	public void run() {
		System.out.println(name + "가 달린다.");
		System.out.println(name + "이는 " + age + "살이다.");
	}
	
	@Override //재정의 부모 것을 다시 고쳐 쓴다
	public void cry() {
		System.out.println("멍멍~~");
	}
}
