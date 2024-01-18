package operator1;

public class OperatorScoreExam02 {

	public static void main(String[] args) {
		/* 문6) 김자바는 자바 95점, 소프트웨어 30점을 받았습니다.
 		이번 학기에 두 과목 중 적어도 한 과목이 70점 이상이면 "통과"
 		그렇지 않으면  "재수강"으로 처리하려고 합니다.
 		김자바의 결과를 출력하는 프로그램을 작성하세요.
		 */
		//#1. 변수 선언
		String name = "김자바";
		int java = 95;
		int software = 30;
		
		//#2. 삼항 연산자를 이용하여 판단
		String result = (java >= 70 || software >= 70)? "통과" : "재수강";
		
		//#3. 결과 출력
		System.out.println(name + "의 이번 학기 결과는 " + result + "입니다.");
		
	}

}
