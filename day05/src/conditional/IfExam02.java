package conditional;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		/* 
		문2) 숫자를 입력받아 숫자가 홀수이면 숫자의 2배의 값을 출력하시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int num = sc.nextInt();
		if (num % 2 == 1) {
			System.out.println("홀수를 입력하여 " + num * 2 + "이 출력됩니다.");
		}
		
		/*
		숫자를 입력받아서 짝수이면 입력받은 숫자의 3배를
		홀수이면 입력받은 숫자의 2배로 처리
		 */
		int resultNum;
		String result;
		System.out.println("-----------------------------");
		if (num % 2 == 1) {
			resultNum = num * 2;
			result = "홀수";
		} else {
			resultNum = num * 3;
			result = "짝수";
		}
		System.out.println(result + "를 입력하여 " + resultNum + "이 출력됩니다.");
		sc.close();
	}

}
