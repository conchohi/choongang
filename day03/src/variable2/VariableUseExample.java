package variable2;

public class VariableUseExample {

	public static void main(String[] args) {
	  //3시간 5분, 총 185분
		//#1. 변수 선언
		int hour = 3; //지역변수 - {}범위 사용하는 변수,
					 // 지역변수는 {}안에서만 사용할 수 있음
		int minute = 5;
		int totalMinute = (hour * 60) + minute;
		
		//#2. 출력
		System.out.println(hour + "시간 " + minute + "분");
		System.out.println("총 " + totalMinute + "분");
		
		
	}

}
