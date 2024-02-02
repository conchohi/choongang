package exam05.interface1;

public class Point implements Shape{

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
