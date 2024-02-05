package exception;

public class ExceptionExam05 {

	public static void main(String[] args) {
		//직접 처리하는 경우
		show4();
	}
	
	static void show4() {
		try {
			System.out.println("안녕~~~");
			Thread.sleep(5000);
			System.out.println("즐거운 시간 ~~ ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //5초간 실행을 멈춤
	}

}
