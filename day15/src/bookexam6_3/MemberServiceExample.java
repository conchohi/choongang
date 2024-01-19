package bookexam6_3;

public class MemberServiceExample {

	public static void main(String[] args) {
	//#1. MemberService 객체를 생성
		MemberService memberService = new MemberService();
		
	//#2. 객체 활용
		//#2-1. 로그엔메소드를 호출하고 나면 결과로 true/false를 리턴받음
		/*
		 	결과를 리턴받아 결과가 true이면 '로그인 되었습니다.' 메세지 출력
		 	결과가 false이면 'id 또는 password가 올바르지 않습니다.' 메세지 출력
		 	1) 로그인 메소드를 호출해서 결과를 받아야 함
		 		boolean 변수 선언 : 지역변수명 - result
		 	2) 결과가 true /false 처리 -> if ~ else 문
		 */
		//#2-2. login() 메소드 호출
		boolean result = memberService.login("hong", "12345");
		
		//#2-3. 판단 - id와 password가 맞는지 확인
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			//#2-4. logout() 메소드 호출
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}//end of if
		
	}

}
