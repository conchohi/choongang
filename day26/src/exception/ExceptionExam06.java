package exception;

public class ExceptionExam06 {

	public static void main(String[] args) {
		//전가 받아 처리
		try {
			show4();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static void show4() throws InterruptedException{
		System.out.println("안녕~~~");
		Thread.sleep(5000);
		System.out.println("즐거운 시간 ~~ ");
	}

}
