package staticmember.bookexam;

public class PersonExam {

	public static void main(String[] args) {
		Person p1 = new Person("12345", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
//		p1.TEST = 30; //final static으로 이미 선언과 동시에 초기화되었으므로
//		Person.TEST = 30; //이미 선언과 동시에 초기화 되어 있는 상수이므로
		
//		p1.nation = "USA"; //final 필드 변경 불가
						//초기화 시킨 후에는 값을 변경할 수 없음
//		p1.ssn = "45678";
		p1.name = "김자바"; //인스턴스 필드 - 언제든지 변경할 수 있음ㄴ

		Person p2 = new Person("7890", "이강산");
		System.out.println(p2.nation);
		System.out.println(p2.ssn);
		System.out.println(p2.name);
	}

}
