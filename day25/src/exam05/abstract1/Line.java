package exam05.abstract1;

public abstract class Line extends Shape{
	private int length;
	
	public Line(String name, int length) {
		super(name);
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}

}
