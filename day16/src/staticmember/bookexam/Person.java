package staticmember.bookexam;

public class Person {
	//#1. 필드 - 인스턴스 필드
	final String nation = "Korea"; //객체마다 새롭게 선언 가능
//	final static String NATION = "Korea"; //상수
	final static int TEST = 30; //클래스 영역에 생성
//	final static int TEST; //final static은 초기화 필수
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	//nation은 이미 선언과 동시에 초기화가 되어있어 변경할 수 없음
//	public Person(String nation, String ssn, String name) {
//		this.nation = nation; //이미 초기화 된 final 필드는 생성자로도 변경 X
//		this.ssn = ssn;
//		this.name = name;
//	}

}
