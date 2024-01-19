package assignment01;

import java.util.Scanner;

public class ScannerExam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println("당신이 입력한 숫자는 " + num + "이고, " + result + "입니다.");
		
		sc.close();
	}

}
