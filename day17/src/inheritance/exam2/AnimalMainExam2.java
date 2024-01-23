package inheritance.exam2;

public class AnimalMainExam2 {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Dog dog = new Dog("복실이");
//		Cat cat = new Cat("야옹이", 3, "생선");
//		Bird bird = new Bird();
//		
//		
//		//#2. 객체 이용
//		animal.cry();
//		dog.cry();
//		cat.cry();		
//		bird.cry();
//		
//		System.out.println("dog age : " + dog.age);

		
		Animal[] animal = {//자식타입은 부모타입에 담을 수 있다.
				new Animal(), 
				new Dog("복실이"), 
				new Cat("야옹이", 3, "생선"), 
				new Bird()
		};
		for (Animal ani : animal) {
			ani.cry();
			if(ani instanceof Dog) {
				((Dog)ani).run();
			}else if(ani instanceof Cat) {
				((Cat)ani).jump();
			}
		}
	}

}
