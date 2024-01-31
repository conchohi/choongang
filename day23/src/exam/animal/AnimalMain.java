package exam.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] animals = {
				new Cat("야옹이", 3),
				new Dog("멍멍이", 4),
				new Bird("참새", 5)
		};
		
		for (Animal animal : animals) {
			animal.cry();
			
			if(animal instanceof RunnableAnimal runAnimal) {
				runAnimal.run();
			}
			if(animal instanceof Flyable) {
				Flyable flyAnimal = (Flyable)animal;
				flyAnimal.fly();
			}
			System.out.println();
		}
	}

}
