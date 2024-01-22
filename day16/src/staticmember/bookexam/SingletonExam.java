package staticmember.bookexam;

public class SingletonExam {
	//#1. 생성자 - 생성자의 이름은 클래스명과 같다
	private SingletonExam() {}
	
	//#2. 필드 - 정적 필드(=static)
	private static SingletonExam instance = new SingletonExam();
	
	//#3. 메소드
	public static SingletonExam getInstance() {
		return instance;
	}

}
