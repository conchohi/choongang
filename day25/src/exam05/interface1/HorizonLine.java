package exam05.interface1;

public class HorizonLine extends Line{

	public HorizonLine(int length) {
		super(length);
	}

	@Override
	public void draw() {
		for(int i = 0; i < getLength(); i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println();
	}

	@Override
	public void showInfo() {
		System.out.println("수평선을 그립니다.");
		System.out.println("수평선 길이 : " + getLength());
	}

}
