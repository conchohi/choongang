package exam.shape;

public class Point extends Shape {
	
	public Point() {
		name = "점";
	}
	
	@Override
	public void draw() {
		System.out.println("*");
	}
}
