package exam.bookexam;

public abstract class CountableAbstract { //스스로 객체 생성 불가
	//#1. 필드
	String name;
	int count;
	
	//#2. 생성자
	public CountableAbstract(String name) {
		this(name, (int)(Math.random()*10 + 1));
	}
	
	public CountableAbstract(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	//#3. 메소드
	//추상 메소드 - 미완성 메소드, body({ })가 없는 메소드
	public abstract void count();
}
