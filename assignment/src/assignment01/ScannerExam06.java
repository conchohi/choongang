package assignment01;

import java.util.Scanner;

public class ScannerExam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 >> ");
		int num2 = sc.nextInt();
		
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("첫번째 숫자 : " + num1);
		System.out.println("두번째 숫자 : " + num2);
		System.out.println("두 수 중 큰 값은 " + max +"입니다.");
		
		sc.close();
	}

}
