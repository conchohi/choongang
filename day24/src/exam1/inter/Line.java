package exam1.inter;

public abstract class Line implements ShapeInterface {
	//자식이 완성하도록 추상메소드 구현 X
	private int length;
	
	public Line(int length) {
		this.length = length;
	}
	
	//선의 길이를 외부에서 부르려면 getter
	public int getLength() {
		return length;
	}
}
