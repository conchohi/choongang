package bookexam6_3;

public class MemberService {
	//#1. 필드 (= 인스턴스 변수, 멤버변수) - 객체가 생성될 때 메모리에 올라감 (힙영역)
	
	
	//#2. 생성자 - 객체를 초기화
	
	//#3. 메소드 - 동작방식, 기능
	// 접근제어자 리턴타입 메소드명(매개변수) { 실행문 } 

	
	/*1. 메소드 - boolean login(String id, String password)
				 void logout(String id)
	  2. id - hong이고 password가 12345일 경우 true 리턴, 그 외는 false 리턴 
	     -> && 연산자 + if ~ else, 삼항연산자 ()?참:거짓
	 */
	
	public boolean login(String id, String password) { //인스턴스 메소드
		boolean result = false;
//		//id와 password가 기존의 id와 password와 같은지 비교
//		if(id.equals("hong") && password.equals("12345")) {
//			result = true;
////			return true;
//		} else {
//			result = false;
////			return false;
//		}//end of if
		
//		result = (id.equals("hong") && password.equals("12345")) ? true : false;
		result = (id.equals("hong") && password.equals("12345"));
		
		return result;
	}
	
	public void logout(String id) { //인스턴스 메소드
		//id로 로그인 되어 있나를 판단.
		//로그인 되어 있는 자원을 반환하고 로그아웃 시키기
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
