package abstract1;

public class AnimalMain {

	public static void main(String[] args) {
		//컴파일 에러 - 추상 메소드(미완성 메소드)를 포함한 
		//			 추상 클래스 객체 생성 불가
//		Animal animal = new Animal(); //추상 클래스
//		Cat cat = new Cat(); //추상 클래스
		
		Dog dog = new Dog();
		Animal aniDog = new Dog(); //자식은 부모타입에 대입 가능
		
		dog.cry();
		dog.count = 30;

		System.out.println(dog.count);
		
		aniDog.cry();
		aniDog.count = 70;
		System.out.println(aniDog.count);
		
		Animal ani = new Animal() {//익명 객체
			
			@Override
			public void cry() {
				System.out.println("동물이 울어요");
			}
		};
		
		ani.cry();
	}

}
