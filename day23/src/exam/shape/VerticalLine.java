package exam.shape;

public class VerticalLine extends Line{

	public VerticalLine(int length) {
		super(length);
		name = "수직선";
	}

	@Override
	public void draw() {
		for(int i = 0; i < getLength(); i++) {
			System.out.println("*");
		}
	}

}
