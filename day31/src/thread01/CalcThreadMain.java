package thread01;

public class CalcThreadMain {

	public static void main(String[] args) {
		System.out.println("** main **");
		CalcThread cal = new CalcThread();
		cal.start();
		try {
			cal.join(); //cal를 호출한 thread 일시 정지, cal run() 끝날 때 까지
		} catch (InterruptedException e) {
			System.out.println("예외 발생");
		}
		
		System.out.println("------------");
		System.out.println("1 ~ 100까지의 합 : " + cal.getSum());
		
		
		
	}

}
