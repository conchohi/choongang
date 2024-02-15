package thread02;

public class AnonymousObjectThread {

	public static void main(String[] args) {
		//#1. 메인 쓰레드
		System.out.println("메인 부분 실행...");
		
		Thread runnableThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					for(int i = 0; i < 5; i++) {
						System.out.println("Hello!! ");
						Thread.sleep(200); //0.2초 동안 멈춤
					}//end of for
				} catch(InterruptedException e) {
					System.out.println("예외 발생");
				}
			}//end of run
		});
		
		runnableThread.start();
		new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(100);
					for(int i = 0; i < 5; i++) {
						System.out.println("JAVA~");
						Thread.sleep(200); //0.2초 동안 멈춤
					}//end of for
				} catch(InterruptedException e) {
					System.out.println("예외 발생");
				}
			}//end of run
		}.start();
//		Thread test = new Thread() {
//			@Override
//			public void run() {
//				try {
//					Thread.sleep(100);
//					for(int i = 0; i < 5; i++) {
//						System.out.println("JAVA~");
//						Thread.sleep(200); //0.2초 동안 멈춤
//					}//end of for
//				} catch(InterruptedException e) {
//					System.out.println("예외 발생");
//				}
//			}//end of run
//		};
//		
//		test.start();
		
		
		
	}

}
