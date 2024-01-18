package class1;

//설계도, 틀, 붕어빵 틀 같은 것
public class Student {
	//#1. 필드(=멤버변수) : 속성
	String name;
	int age;
	int score;
	
	//#2. 생성자 - 객체를 초기화
	//			기본 생성자는 생략 가능 - 생략하면 컴파일 시 컴파일러가 만들어 사용
	public Student() { //생성자의 이름은 클래스명과 동일
		//초기화 필요한 문장
	}
	
	//#3. 메소드 - 동작방식, 기능처리
	public void goToSchool() {
		System.out.println(name + "이(가) 학교에 간다.");
	}

}
