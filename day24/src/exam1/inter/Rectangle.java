package exam1.inter;

public class Rectangle implements ShapeInterface{
	private int width; //가로
	private int height; //세로
	
	public Rectangle(int width, int height) {
		setWidth(width);
		setHeigth(height);
	}
	
	private void setWidth(int width) {
		if(width > 0) {
			this.width = width;
		} else {
			System.out.println("가로 길이는 0보다 커야 합니다.");
		}
	}
	
	private void setHeigth(int height) {
		if(width > 0) {
			this.height = height;
		} else {
			System.out.println("세로 길이는 0보다 커야 합니다.");
		}
	}
	@Override
	public void draw() {
		System.out.println("사각형의 가로 길이 : " + width);
		System.out.println("사각형의 세로 길이 : " + height);
		
		//행 = 바깥쪽(세로), 열 = 안쪽(가로)
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
		System.out.println("사각형을 그립니다.");
	}

}
