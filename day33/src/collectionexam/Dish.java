package collectionexam;

public class Dish {
	int value;
	
	public Dish(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value + "번째 접시";
	}
	
	public int getValue() {
		return value;
	}
	
}
