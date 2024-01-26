package abstract1;

public class Dog extends Animal{

	@Override //재정의, 부모 것 고쳐씀
	public void cry() {
		System.out.println("멍멍!");
	}
	
}
