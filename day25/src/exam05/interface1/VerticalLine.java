package exam05.interface1;

public class VerticalLine extends Line{

	public VerticalLine(int length) {
		super(length);
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
		System.out.println("수직선을 그립니다.");
		System.out.println("수직선 길이 : " + getLength());
	}

}
