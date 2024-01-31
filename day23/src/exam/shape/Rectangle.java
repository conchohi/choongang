package exam.shape;

public class Rectangle extends Shape {
	private int width; //가로
	private int length; //세로
	
	public Rectangle(int width, int length) {
		name = "사각형";
		this.width = width;
		this.length = length;
	}
	
	@Override
	public void draw() {
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
