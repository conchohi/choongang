package operator1;

public class OperatorExam {

	public static void main(String[] args) {
		System.out.println(5 / 3); //1
//		System.out.println(4 / 0); //런타임 오류 ArithmeticException: / by zero
		System.out.println(4 / 0.0); //Infinity
		
		int num1 = 5;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + num1 + num2);
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		System.out.println((2 + 3) * 5 / 2 - 7);
		
		// *, / 연산자가 +, - 연산자보다  우선순위가 높음
	}

}
