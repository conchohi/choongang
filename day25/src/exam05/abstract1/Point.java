package exam05.abstract1;

public class Point extends Shape{

	public Point() {
		super("점");
	}

	@Override
	public void draw() {
		System.out.println("*");
		System.out.println();
	}

}
