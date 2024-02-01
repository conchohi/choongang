package exam1.inter;

public class Point implements ShapeInterface{

	@Override
	public void draw() {
		System.out.println("*");
		System.out.println();
	}

	@Override
	public void showInfo() {
		System.out.println("점을 그립니다.");
	}
}
