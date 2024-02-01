package exam1;

public abstract class Shape {
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	//# 그리기 작업은 도형마다 알아서 그리도록 설정, 추상메소드
	public abstract void draw(); //{ } 부분(body)가 없는 것을 추상 메소드, 미완성 메소드
	
	//# 어떤 도형을 그리는지 안내하는 문구, 인스턴스 메소드
	private void showInfo() { //자식에서 부를 수 없음, 숨겨져 있음
		System.out.println(name + "을 그립니다.");// ~을 그립니다.
	}
	
	//자식에서는 마음대로 불러 사용할 수 있되, 재정의(오버라이딩) 불가능
	//public final 
	
	public void printDraw() {
		// showInfo() 와 draw() 사용
		showInfo(); //private 라 같은 클래스에서는 자유롭게 호출하지만 외부에서 호출 불가
					//그래서 자신의 클래스인 여기서 호출
		draw(); //재정의(오버라이딩)한 자식의 draw() 메소드 호출
	}
}
