package exam.inherited;

public class AnimalMain {

	public static void main(String[] args) {
		//객체 생성
		Dog dog = new Dog("멍멍이", 3);
		Cat cat = new Cat("야옹이", 5);
		
		dog.cry();
		dog.showInfo();
		System.out.println(dog);
		System.out.println();
		
		cat.cry();
		System.out.println(cat);
		
		//다형성
		Animal[] animals = {
				new Dog("멍멍이", 3), 
				new Cat("야옹이", 5),
				new Bird("참새", 2)
				};
	
		//for문
		for(int i = 0; i < animals.length; i++) {
			animals[i].cry(); //부모의 것 가져다 자식이 재정의
//			System.out.println("이름 : " + animals[i].name); //자식의 것 사용 불가능
			System.out.println(animals[i]); //Object 메소드 재정의
			if(animals[i] instanceof Dog) {
				Dog dogAni = (Dog)animals[i];
				System.out.println("이름 : " + dogAni.name);
			} else if (animals[i] instanceof Cat catAni) {
				System.out.println("이름 : " + catAni.name);
			}
			
		}
		
		//향상된 for문
		for (Animal animal : animals) {
			animal.cry();
		}
		
	}

}
