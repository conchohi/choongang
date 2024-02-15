package thread01;


public class TheNeedForThread {

	public static void main(String[] args) {
		//#1. Thread가 단일 쓰레드일 경우
		
		//#1-1. 영상 설정
		String[] strVideoArray = {"영상1", "영상2", "영상3","영상4","영상5"};
		
		//#1-2. 자막 설정
		String[] strSubtitleArray = {"자막1","자막2","자막3","자막4","자막5"};
		
		//#2-1. 영상 실행
		for (int i = 0; i < strVideoArray.length; i++) {
			System.out.print("비디오 장면 : " + strVideoArray[i] + " ");
			try {
				Thread.sleep(200); //1000 - 1초, 0.2초 동안 잠시 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace(); //개발이 완료된 후에는 반드시 삭제 또는 주석 처리
			}
		}
		
		//#2-2. 자막 실행
		for (int i = 0; i < strSubtitleArray.length; i++) {
			System.out.print("비디오 자막 : " + strSubtitleArray[i] + " ");
			try {
				Thread.sleep(200); //1000 - 1초, 0.2초 동안 잠시 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace(); //개발이 완료된 후에는 반드시 삭제 또는 주석 처리
			}
		}
		
	}

}
