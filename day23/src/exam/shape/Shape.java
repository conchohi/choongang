package exam.shape;

public abstract class Shape {
	String name;
	public abstract void draw();
	public void showInfo() {
		System.out.println(name + "을 그리고 있습니다.");// ~을 그리고 있습니다.
	}
	public void printDraw() {
		// showInfo() 와 draw() 사용
		showInfo();
		draw();
	}
}
