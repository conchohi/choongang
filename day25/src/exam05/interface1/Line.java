package exam05.interface1;

public abstract class Line implements Shape{
	private int length;
	
	public Line(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}

}
