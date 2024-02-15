package thread02;

//손님 - thread
public class Customer implements Runnable {
	private final Dish dish;
	
	public Customer(Dish dish) {
		this.dish = dish; //초기화
	}
	
	//(int i) : 음식 종류 
	private void eat(int i) throws InterruptedException {
		
		//공유 자원을 동기화 - 요리사와 고객이 dish를 공유하기 떄문에 동기화
		synchronized (dish) { //동기화 블록
			while(dish.isEmpty()) { //빈 접시면
				dish.wait(); //기다림
			}
			//빈 접시가 아니면 음식을 먹어서 접시를 비움
			System.out.println(i + "번째 음식을 먹었습니다.");
			dish.setEmpty(true);
			dish.notify(); //wait()로 인해 일시정지 상태인 경우 실행 대기 상태로 만들기
						   //요리사에게 요리 다 먹었다고 통보
		}
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				eat(i);
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println("예외 발생");
			}
		}
	}
}
