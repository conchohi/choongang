package thread02;

public class CreateAndStartThreadRunnable {

	public static void main(String[] args) {
		//#1. main thread
		System.out.println("main thread ... ");
		
		//#2. 영상 쓰레드 객체 생성 및 실행
//		Runnable movieRunnable = new MovieRunnable();
//		Thread movieThread = new Thread(movieRunnable);
		Thread movieThread = new Thread(new MovieRunnable());
		movieThread.start();
		
		//#3. 자막 쓰레드 객체 생성 및 실행
		Runnable subtitleRunnable = new SubtitleRunnable();
		Thread subtitleThread = new Thread(subtitleRunnable);
		subtitleThread.start();
		
		//#4. 메인 쓰레드 부분
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("-----------");
		System.out.println("메인 부분 ...");
	}

}
