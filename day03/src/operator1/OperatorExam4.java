package operator1;

public class OperatorExam4 {

	public static void main(String[] args) {
		//#1. 변수 선언
		int num = 5;
		String result = ""; 
		
		//#2. 삼항 연산자 활용
			//( 조건 ) ? 조건의 결과가 참일 때 실행할 문장 : 거짓일 때 실행할 문장
		result = (num % 2 == 1)? "A팀": "B팀";
		
		//#3. 화면 출력
		System.out.println(result);
		
		//문4) 성적이 80점 이상이면 "합격" 그렇지 않으면 "불합격" 처리하시오.
		//#1. 변수 선언
		int score = 55;
		String result2 = "";
		
		//#2. 삼항 연산자 활용
		result2 = (score >= 80)? "합격" : "불합격";
		
		//#3. 화면 출력
		System.out.printf("성적 : %d -> %s\n", score, result2);
		
		
	}

}
