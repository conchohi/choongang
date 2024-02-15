package thread03;

public class TestDaemon implements Runnable {

	@Override
	public void run() {
			for(int i = 0; i < 20; i++) {
				//#1. 1초 동안 멈춤
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					System.out.println("쓰레드 예외 발생");
				}
				
				System.out.println("****** 지금은 보조 작업 쓰레드 실행 ******");
				System.out.println(Thread.currentThread().getName());
				//currentThread() : 현재 작업 중인 쓰레드
				//getName() : 쓰레드 이름 읽어 오기
				//setName(쓰레드명) : 쓰레드 이름 설정
			}
	}

}
