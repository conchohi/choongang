package accessmodifier.test1.exam1;

public class Abc {
	private String name;
	private int age;
	private int score;
	
	public Abc() {
		super();
	}
	
	public Abc(String name) {
		super();
		this.name = name;
	}
	

	public Abc(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
	
}
