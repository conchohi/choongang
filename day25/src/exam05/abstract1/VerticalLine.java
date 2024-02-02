package exam05.abstract1;

public class VerticalLine extends Line{

	public VerticalLine(int length) {
		super("수직선",length);
	}

	@Override
	public void draw() {
		for(int i = 0; i < getLength(); i++) {
			System.out.println("|");
		}
		System.out.println();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("수직선 길이 : " + getLength());
	}

}
