package interfaceexam;

public class InterfaceCat implements InterfaceAnimal{
	@Override //재정의 - 부모의 것을 고쳐 사용
	public void cry() {
		System.out.println("야옹~~");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
