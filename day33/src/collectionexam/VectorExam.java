package collectionexam;

//import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		List<Board> list = new Vector<>(); //멀티 쓰레드 환경, 동기화
//		List<Board> list = new ArrayList<>(); //단일 쓰레드 환경
		
		//list에 객체를 추가하는 작업 Thread
		Thread thread = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					list.add(new Board("제목"+i,"글쓴이"+i,"내용"+i));
				}//end of for
			}//end of run
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for(int i = 101; i <= 200; i++) {
					list.add(new Board("제목"+i,"글쓴이"+i,"내용"+i));
				}//end of for
			}//end of run
		};
		
		//Thread 시작
		thread.start();
		thread2.start();
		
		//Thread가 작업을 완료할 때 까지 main Thread를 잠시 멈춤
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println("예외 발생");
		}
		
		System.out.println("------------------------");
		System.out.println("총 객체 수 : " + list.size());
		//Vector는 항상 200, ArrayList는 계속 값이 바뀜
		
	}

}
