package method;

public class MethodExam01_refat2 {

	public static void printShow(int num) { //end -> 매개변수, 파라미터
//		int num; //지역변수, 매개변수, 파라미터
//		int sum = 0; 
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//		}
		System.out.println("1 ~ " + num +"까지의 합 : " + sumCall(1,num));
		return; //void에선 생략가능, 자신을 감싸고 있는 메서드 빠져나감
	}

	public static void main(String[] args) {
		showInfo(); //메서드 호출
		System.out.println("-----------------");
		printShow(100);
		System.out.println("-----------------");
		System.out.println("1 ~ 5까지의 합 : " + sumCall(1,5));	
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
