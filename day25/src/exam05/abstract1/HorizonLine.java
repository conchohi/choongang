package exam05.abstract1;

public class HorizonLine extends Line{

	public HorizonLine(int length) {
		super("수평선",length);
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
		super.showInfo();
		System.out.println("수평선 길이 : " + getLength());
	}

}
