package method;


public class MethodExam03 {

	public static void main(String[] args) {
		//1. 두 정수를 덧셈하는 메소드 작성, 메소드명 : add(3,5)
		System.out.println("add(3,5) : " + add(3,5));
		
		//2. 세 정수를 덧셈하는 메소드 작성, 메소드명 : add2(2,4,7)
		System.out.println("add2(2,4,7) : " + add2(2,4,7));
		
		//3. 두 실수(double)형의 값을 곱셈하는 메소드 작성, 메소드명 : multiDouble(1.5,2.7)
		System.out.println("multiDouble(1.5,2.7) : " + multiDouble(1.5,2.7));
		
		//4. 정수와 실수를 덧셈하는 메소드 작성, 메소드명 : add3(5,2.6)
		System.out.println("add3(5,2.6) : " + add3(5,2.6));
	}//end of main
	
	// 메소드를 정의
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static int add2(int num1, int num2, int num3) {		
		return num1 + num2 + num3;
	}
	public static double add3(int num1, double num2) {		
		return num1 + num2;
	}
	public static double multiDouble(double num1, double num2) {
		return num1 * num2;
	}

}
