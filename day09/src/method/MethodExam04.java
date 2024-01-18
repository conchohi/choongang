package method;


public class MethodExam04 {

	public static void main(String[] args) {
		System.out.println("add(3,5) : " + add(3,5));
		System.out.println("add(2,4,7) : " + add(2,4,7));
		System.out.println("multiple(1.5,2.7) : " + multiple(1.5,2.7));
		System.out.println("add(5,2.6) : " + add(5,2.6));
	}//end of main
	
	// 메소드를 정의
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static int add(int num1, int num2, int num3) {		
		return num1 + num2 + num3;
	}
	public static double add(int num1, double num2) {		
		return num1 + num2;
	}
	public static int multiple(int num1, int num2) {
		return num1 * num2;
	}
	public static double multiple(double num1, double num2) {
		return num1 * num2;
	}

}
