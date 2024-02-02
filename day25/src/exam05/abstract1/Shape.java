package exam05.abstract1;

public abstract class Shape {
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract void draw();
	
	public void showInfo() {
		System.out.println(name + "을 그립니다.");
	}
	
	public void printDraw() {
		showInfo();
		draw();
		System.out.println();
	}
	
}
