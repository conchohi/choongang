package accessmodifier;

public class GetterSetterExam {
	//#1. 필드
	private String id = "abcd";
	private String password = "1234";

	//#2. 생성자 - 기본 생성자는 컴파일 시 만들어짐, 생략되어 있음
	public GetterSetterExam() {}
	
	public GetterSetterExam(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	//#3. 메소드
	//getter : private으로 선언된 필드를 읽어서 넘겨주는 역할
	//			필드명 앞에 get을 붙이고 필드명의 첫글자를 대문자로
	//			불린형은 is를 붙이고 필드명의 첫글자를 대문자로
	
	//setter : private으로 선언된 필드를 수정
	//			필드명 앞에 set을 붙이고 필드명의 첫글자를 대문자로
	
	public void show() {
		System.out.println("id = "+ id);
	}
	
	public String getId() {
		//유효성 검사
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
}
