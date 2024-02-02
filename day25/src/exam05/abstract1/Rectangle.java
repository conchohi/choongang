package exam05.abstract1;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("가로 길이 : " + width);
		System.out.println("세로 길이 : " + height);
	}

}
