package exception;

public class ExceptionExam02 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		try { //예외가 발생할 수 있는 구문 작성
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println(a/b);
		} catch(Exception e) { //예외 발생시 처리할 구문
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage()); //메세지 출력
			e.printStackTrace(); //예외가 발생한 모든 경로를 알려줌
					//개발 전 테스팅이나 예외원인을 알기 위해 사용
					//개발 끝나면 반드시 지우거나 주석 처리, 로그
					//java.lang.ArithmeticException: / by zero
					//at exception.ExceptionExam02.main(ExceptionExam02.java:12)
	
		} 
	}

}
