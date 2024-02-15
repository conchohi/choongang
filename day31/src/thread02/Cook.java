package thread02;

//요리사 - thread
public class Cook implements Runnable {
	private final Dish dish;
	
	public Cook(Dish dish) {
		this.dish = dish; //초기화
	}
	
	//(int i) : 음식 종류 
	private void cooking(int i) throws InterruptedException {
		
		//공유 자원을 동기화 - 요리사와 고객이 dish를 공유하기 떄문에 동기화
		synchronized (dish) { //동기화 블록
			while(!dish.isEmpty()) { //빈 접시가 아니면
				dish.wait(); //기다림
			}
			//빈 접시면
			dish.setEmpty(false);
			System.out.println(i + "번째 음식이 준비되었습니다.");
			dish.notify(); //wait()로 인해 일시정지 상태인 경우 실행 대기 상태로 만들기
						   //손님에게 요리 다 되었다고 통보
		}
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				cooking(i);
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("예외 발생");
			}
		}
	}
}
