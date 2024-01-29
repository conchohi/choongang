package interfaceexam;

public class Dog extends Animal{
	
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override //재정의 - 부모의 것을 고쳐 사용
	public void cry() {
		System.out.println("멍멍!");
	}

	public void run() {
		System.out.println(name + "이가 달린다.");
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("자식이 수정한 부분");
	}
}
