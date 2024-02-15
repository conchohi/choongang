package thread01;

public class HelloJavaThread implements Runnable{ //extends Thread 

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			sleep(500);
			System.out.print("Hello!! ");
		}
	}
	
	public static void sleep(long num) {
		try {
			Thread.sleep(num);
		} catch (InterruptedException e) {
			System.out.println("예외 발생");
		}
	}
	
}
