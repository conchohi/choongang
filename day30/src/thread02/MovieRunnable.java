package thread02;

public class MovieRunnable implements Runnable {

	@Override
	public void run() {
		String[] strVideoArray = {"영상1", "영상2", "영상3","영상4","영상5"};
		
		for (int i = 0; i < strVideoArray.length; i++) {
			System.out.print(strVideoArray[i] + " ");
			try {
				Thread.sleep(500); //1000 - 1초, 0.5초 동안 잠시 멈춤
			} catch (InterruptedException e) {
				System.out.println("예외가 발생하였습니다.");
			}
		}
	}

}
