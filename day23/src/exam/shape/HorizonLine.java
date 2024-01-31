package exam.shape;

public class HorizonLine extends Line{
	
	public HorizonLine(int length) {
		super(length);
		name = "수평선";
	}

	@Override
	public void draw() {
		for(int i = 0; i < getLength(); i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
