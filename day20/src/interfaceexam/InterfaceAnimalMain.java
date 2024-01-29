package interfaceexam;

public class InterfaceAnimalMain {

	public static void main(String[] args) {
//		InterfaceAnimal iani = new InterfaceAnimal(); //객체 생성 불가, 미완성이라
		InterfaceCat cat = new InterfaceCat();
		InterfaceDog dog = new InterfaceDog();
		
		cat.cry();
		dog.cry();
		
//		InterfaceAnimal[] iani = { //자식 -> 부모
//				new InterfaceDog(),
//				new InterfaceCat()
//		};
		
	}

}
