package assignment01;

import java.util.Scanner;

public class ScannerExam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		String result = (score >= 70) ? "통과하였습니다." : "재수강하셔야 합니다.";
		
		System.out.println("당신의 점수는 " + score + "점 입니다.");
		System.out.println("이번 시험에서 " + result);
		
		sc.close();
	}

}
