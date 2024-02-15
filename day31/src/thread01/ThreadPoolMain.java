package thread01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {

	public static void main(String[] args) {
		System.out.println("** 메인 부분 실행 **");
		
		Thread runnableThreadPool = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					System.out.print("안녕!! ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("예외 발생");
					}
				}
			}
		});
		
		//# Thread Pool 생성
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(runnableThreadPool);
		
		//# 메인 부분 작업
		System.out.println("** main **");
		for(int i = 0; i < 5; i++) {
			System.out.println("즐거운 시간~~ ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("예외 발생");
			}
		}
		System.out.println("** 메인 끝 **");
		
		//# ThreadPool 종료
		exec.shutdown();
	}
	
}
