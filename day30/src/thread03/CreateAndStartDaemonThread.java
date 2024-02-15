package thread03;

public class CreateAndStartDaemonThread {

	public static void main(String[] args) {
		//#1. 메인 쓰레드
		System.out.println("**** 메인 쓰레드 실행 ****");
		
		//쓰레드 객체 생성 및 실행
		Thread daemonThread = new Thread(new TestDaemon());
		daemonThread.setDaemon(true);//데몬 쓰레드 설정
									//주의 - 반드시 start()보다 먼저 선언
		daemonThread.start();//쓰레드 실행
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("**** 메인 쓰레드 종료 ****");
	}

}
