package exam1.inter;

public class HorizonLine extends Line {

	public HorizonLine(int length) {
		super(length);
	}

	@Override
	public void draw() {
		System.out.println("수평선의 길이 : " + getLength());
		for(int i = 0; i < getLength(); i++) {
			System.out.print("-");//수평선이라 줄바꿈 X
		}
		System.out.println();
	}

	@Override
	public void showInfo() {
		System.out.println("수평선을 그립니다.");
		
	}

}
