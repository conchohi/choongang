package bookexam;

import java.util.Scanner;

public class Exam3_2_9 {

	public static void main(String[] args) {
//		System.out.println(7/0);//ArithmeticException:
//		System.out.println(7/0.0);//Infinity(무한대)
//		int a = 7;
//		double b = 0.0;
//		System.out.println((a/b)+3);
//		System.out.println(7 % 0); //ArithmeticException : by zero
//		System.out.println(7 % 0.0); //NaN (Not a Number)
//		System.out.println((a % b) + 3); //NaN (Not of Number)
		
		//#1. 변수 선언
		Scanner sc = new Scanner(System.in);

		//#2. 입력받기
		System.out.print("첫 번째 수: ");
		double num1 = sc.nextDouble();
		System.out.print("두 번째 수: ");
		double num2 = sc.nextDouble();
		
		//#3. 결과
		double num = num1 / num2;
//		result = (num2 == 0.0)?"무한대":String.valueOf(num1/num2);
		String result = (Double.isInfinite(num))?"무한대":String.valueOf(num);
		System.out.println("-----------------");
		System.out.println("결과 : " + result);
		sc.close();
	}

}
