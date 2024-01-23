package inheritance.exam1;

public class AnimalMainExam {

	public static void main(String[] args) {
		//#1. 객체 생성
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		
		//#2. 객체 이용
		animal.name = "동물들";
		animal.age = 5;
		animal.cry();
		System.out.println("---------------");
		
		cat.name = "야옹이";
		cat.age = 3;
		cat.cry();
		System.out.println("---------------");
		
		dog.name = "멍멍이";
		dog.age = 5;
		dog.cry();
		System.out.println("---------------");
		
		bird.name = "짹짹이";
		bird.age = 4;
		bird.cry();
		

	}

}
