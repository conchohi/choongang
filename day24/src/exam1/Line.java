package exam1;
//선의 종류 : 수평선, 수직선이 있음
// 			수평선과 수직선이 그리기 다르고 기능이 다르다면 분할하는 것이 좋음

//라인 - 부모, 수평선/수직선 - 자식
//부모의 추상메소드를 자식이 완성하지 않으면 자식도 추상 클래스가 된다.
public abstract class Line extends Shape {
	//수평선과 수직선의 공통점만 부모인 라인에 잡기
	// -> 선의 길이
	private int length;
	
	static {
		//초기화, 미리 처리
	}
	
	public Line(String name, int length) {
		super(name);
		this.length = length;
//		if(length <= 0) {
//			System.out.println("길이는 0보다 큰 값을 입력해야 합니다.");
//			this.length = 0;
//		}
	}
	//선의 길이를 외부에서 부르려면 getter
	public int getLength() {
		return length;
	}
	
//	@Override //자식인 Line에서 완성하지 않고 그 자식인 수평선/수직선에서 완성하려고 함
			  //따라서 Line도 부모의 추상 메소드를 가지게 됨으로
			  //추상 클래스가 되어야 함. 
			  //-> 수평선과 수직선은 그리는 방식이 다르기 때문에 상속 받는 자식이 처리
//	public void draw() {}
	
	//선의 길이가 0이면 길이가 없음, 선의 길이가 0보다 크면 그려주면 됨
//	public void setLength(int length) {
//		this.length =  (length > 0) ? length : 0;
//	}
}
