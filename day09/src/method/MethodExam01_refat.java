package method;

public class MethodExam01_refat {

	public static void main(String[] args) {
		showInfo(); //메서드 호출

		System.out.println("1 ~ 5까지의 합 : " + sumCall(1,5));
									//sumCall()메서드를 호출한다.
									//1, 5 -> 매개값, 인자
		System.out.println("1 ~ 10까지의 합 : " + sumCall(1,10));
		System.out.println("50 ~ 100까지의 합 : " + sumCall(50,100));
		System.out.println("35 ~ 75까지의 합 : " + sumCall(35,75));
		
		showInfo(); //메서드 호출
		
	}//end of main
	
	public static int sumCall(int start, int end) { //start, end -> 매개변수, 파라미터
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void showInfo() {
		System.out.println("여기는 리턴 값이 없는 것을 연습함");
		
		
	}
}
