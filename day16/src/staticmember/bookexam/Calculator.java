package staticmember.bookexam;

public class Calculator {
	//final - 여기 외에는 다른 곳에서 수정할 수 없음
	//static - 객체 생성 없이 공통으로 사용
	public static final double PI = 3.14;
	public static int jumsu1 = 7; 
	int instanceValue = 3;
	
	public static int plus(int x, int y) {
		return x + y;
	}
	public static int minus(int x, int y) {
		return x - y;
	}
	
	void showInfo(int num1, int num2) {
		int result = plus(num1,num2) + jumsu1;
		System.out.println("결과 : " + result);
	}
	
//	static void printShow() {//static 메소드 안에서 인스턴스 필드, 
//							 //메소드 사용 불가능
//		System.out.println(InstanceValue); 
//		showInfo(10,20);
//		
//	}
}
