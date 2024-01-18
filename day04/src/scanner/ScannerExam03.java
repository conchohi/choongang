package scanner;

import java.util.Scanner;

public class ScannerExam03 {

	public static void main(String[] args) {
		/*
		문2) 숫자를 입력받아서 짝수와 홀수를 판별하는 프로그램을 작성하세요.
		
		<출력형태>
		당신이 입력한 숫자는 8이고 짝수입니다.
		
		당신이 입력한 숫자는 37이고, 홀수입니다.
		
		 */
		//#1. 변수 선언
		int num = 0;
		String result = "";
		//#2. Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#3. 안내문구
		System.out.print("숫자를 입력하세요 : ");
		
		//#4. 입력받은 값 변수에 담기
		num = scan.nextInt();
		
		//#5. 결과
		result = (num % 2 == 0) ? "짝수" : "홀수";
//		System.out.println("당신이 입력한 숫자는 " + num + "이고, " + result + "입니다.");
		System.out.printf("당신이 입력한 숫자는 %d이고, %s입니다.\n", num, result);
		scan.close();
	}

}
