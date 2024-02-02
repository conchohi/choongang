package exam01.abstract1;

public abstract class Countable {
	private String name;
	private int number;
	
	public Countable(String name) {
		this.name = name;
		this.number = (int)(Math.random() * 10) + 1;
	}
	
	public abstract void count();

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

}
