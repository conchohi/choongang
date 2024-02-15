package thread01;

public class SubtitleThread extends Thread {
	@Override
	public void run() { //멀티 쓰레드로 작업할 내용
		//#1-1. 자막 설정
		String[] strSubtitleArray = {"자막1","자막2","자막3","자막4","자막5"};
		
		try {
			Thread.sleep(100); //자막을 0.01초 정도 늦게 출력되도록 설정
			//멀티 쓰레드는 독립적으로 실행되기 때문에 먼저 start() 메소드로 호출해도
			//나중에 실행된 쓰레드보다 늦게 실행될 수 있음
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//#2-1. 자막 실행
		for (int i = 0; i < strSubtitleArray.length; i++) {
			System.out.print(strSubtitleArray[i] + " ");
			try {
				Thread.sleep(500); //1000 - 1초, 0.5초 동안 잠시 멈춤
			} catch (InterruptedException e) {
				System.out.println("예외가 발생하였습니다.");
			}
		}
	}
}
