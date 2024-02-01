package exam1;

public class VerticalLine extends Line{

	public VerticalLine(int length) {
		super("수직선",length);
	}

	@Override
	public void draw() {
		System.out.println("수직선의 길이 : " + getLength());
		for(int i = 0; i < getLength(); i++) {
			System.out.println("|");
		}
		System.out.println();
	}

}
