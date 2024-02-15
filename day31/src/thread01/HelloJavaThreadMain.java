package thread01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HelloJavaThreadMain {

	public static void main(String[] args) {
		System.out.println("** main thread **");
		//# Thread 객체 생성
		Thread ht = new Thread(new HelloJavaThread());
		
		//# Thread 실행
		ht.setDaemon(true); //데몬 쓰레드로 설정
		ht.start();
		
		//# main thread 작업
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("예외 처리");
			}
			System.out.println(" java");
		}
		System.out.println("** main thread 종료 **");
		
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(ht);
	}

}
