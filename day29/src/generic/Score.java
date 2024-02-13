package generic;

public class Score implements Comparable<Score> {
	//필드 - 인스턴스 필드
	String name;
	int score;
	
	//생성자 - 객체 초기화, 생성자가 없으면 객체 생성 X
	//		 생성자 생략 시 기본 생성자 컴파일러가 자동으로 삽입
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override //재정의, 인터페이스 Comparable의 추상 메소드 구현
	public int compareTo(Score o) {
//		return this.score - o.score;
		if(this.score > o.score) {
			return 1;
		} else if(this.score < o.score) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override //재정의, Object의 toString()을 오버라이딩
	public String toString() {
		return name + " , " + score;
	}
	
	

}
