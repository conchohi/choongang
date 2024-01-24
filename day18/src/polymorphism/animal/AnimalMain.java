package polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Cat cat = new Cat("야옹이", 3);
//		Dog dog = new Dog("멍멍이", 2);
//		Bird bird = new Bird("짹쨱이", 1);
//		
//		animal.cry();
//		cat.cry();
//		dog.cry();
//		bird.cry();
//		System.out.println();
		
		//배열은 같은 타입의 자료를 저장하는 공간
		Animal[] animals = { //자식은 부모 타입에 담을 수 있다. 
							 //부모는 자식 타입에 담을 수 없다.
				new Animal(),
				new Cat("야옹이", 3),
				new Dog("멍멍이", 2),
				new Bird("짹쨱이", 1)
		};
		
//		//출력하기
//		for(int i = 0; i < animals.length; i++) {
//			animals[i].cry();
//			System.out.println();
//		}
		
		//향상된 for문을 이용한 출력
		for (Animal animal : animals) {
			animal.cry();
			System.out.println();
			
//			animal.showInfo(); //에러
			//animal은 부모타입이고, showInfo는 자식에 있기에 실행할 수 없음
			//자식이 부모타입으로 이미 타입 변환을 한 상태라 부모 것만 사용할 수 있음
			//단 오버라이딩된 메소드는 자식 것을 사용
		}
		
		//자식 -> 부모 -> 자식
		//부모가 자식이 될 수 있는지 검토 : instanceof
		//객체 instanceof 타입 -> 타입 변환 가능할 경우 true, 불가능은 false
		// 		자식타입 참조변수 = (자식타입)부모타입;
		
		//java 12버전 부터
		// 객체 instaceOf 자식타입 참조변수; -> 참조변수 사용 가능
		
		//Cat의 자료를 사용하기 위한 작업
		//	- 현재는 Cat 부모타입으로 타입변환되어 있어서
		//	  순수 Cat의 메소드와 필드를 사용할 수 없는 상태
		// 	  Cat만이 가지고 있는 메소드와 필드, 부모의 메소드와 필드를 사용하고 싶을 때
		System.out.println("-----------------");
		
		if(animals[1] instanceof Cat) {
			Cat cat = (Cat)animals[1]; //강제 타입 변환, down cast
			cat.showInfo();
			System.out.println();
		} else {
			System.out.println("타입 변환 불가");
		}
		
		if(animals[1] instanceof Cat cat) {
			cat.showInfo();
			System.out.println();
		} else {
			System.out.println("타입 변환 불가");
		}
		
//		for (Animal animal : animals) {
//			if(animal instanceof Cat cat) {
//				((Cat)animal).showInfo();
//				cat.showInfo();
//			} else if(animal instanceof Dog dog) {
//				((Dog)animal).showInfo();
//				dog.showInfo();
//			} else if(animal instanceof Bird bird) {
//				((Bird)animal).showInfo();
//				bird.showInfo();
//			}
//		}
		
		
		
	}

}
