package exam1;

public class Point extends Shape {
	
	public Point() {
		super("점"); //부모를 자식이 완성시켜 주기 위해
					//포인트 객체 생성할 때(new Point();)
					//먼저 Shape를 초기화한 후 
					//Point를 초기화
	}
	
	@Override
	public void draw() {
		System.out.println("*");
		System.out.println();
	}
}
