package exam1.inter;

public class VerticalLine extends Line {

	public VerticalLine(int length) {
		super(length);
	}

	@Override
	public void draw() {
		System.out.println("수직선의 길이 : " + getLength());
		for(int i = 0; i < getLength(); i++) {
			System.out.println("|");
		}
		System.out.println();
	}

	@Override
	public void showInfo() {
		System.out.println("수직선을 그립니다.");
		
	}

}
