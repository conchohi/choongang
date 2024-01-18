package operator1;

public class OperatorScoreExam01 {
	public static void main(String[] args) {
		/* 문5) 홍길동은 국어 80점 영어 65점 수학 70점을 받았습니다.
		 	  	세 과목 모두 60점 이상이면 이번 시험에서 "통과"를 하고 
		 	  	그렇지 않은 경우 "탈락"을 하게 됩니다. 
		 	  	홍길동의 결과를 출력하는 프로그램을 작성하세요.
		 */
		//#1. 변수 선언
		String name = "홍길동";
		int kor = 80;
		int eng = 65;
		int math = 70;
		
		//#2. 삼항 연산자를 이용하여 판단
		String result = (kor >= 60 && eng >= 60 && math >= 60)? "통과" : "탈락";
		
		//#3. 결과 출력
		System.out.println(name + "의 시험 결과는 " + result + "입니다.");
		
		
	}
}
