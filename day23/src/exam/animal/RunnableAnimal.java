package exam.animal;

public abstract class RunnableAnimal extends Animal{
	
	public RunnableAnimal(String name, int age) {
		super(name, age);
	}

	public void run() {
		System.out.println(name + "가 달린다.");
	}
}
