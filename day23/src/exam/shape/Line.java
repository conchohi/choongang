package exam.shape;

public abstract class Line extends Shape {
	private int length;
	
	public Line(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
}
