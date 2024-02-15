package thread02;

public class SubtitleRunnable implements Runnable {

	@Override
	public void run() {
		String[] strSubtitleArray = {"자막1","자막2","자막3","자막4","자막5"};
		
		try {
			Thread.sleep(100); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

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
