package assignment01;

import java.util.Scanner;

public class Exam27 {

	public static int paper = 100;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("프린트할 용지 매수를 입력하세요 >> ");
		int page = sc.nextInt();
		
		System.out.print("인쇄 방식을 입력하세요 (1. 단면, 2. 양면) >> ");
		int option = sc.nextInt();
		
		printPaper(page, option);
		
		sc.close();
	}
	
	public static void printPaper(int page, int option) {
		if(option == 2) {
			page = (int) Math.ceil(page/2.0);
		} else {
			
		}
		if(page <= paper) {
			paper -= page;
			System.out.println(page + "장을 출력했습니다.");
			System.out.println("남은 용지 매수 : " + paper + "장");
		} else if(paper == 0) {
			System.out.println("용지가 부족합니다.");
		} else {
			System.out.println(page - paper + "장이 부족합니다.");
			System.out.println(paper + "장을 출력했습니다.");
			paper = 0;
		}
	}
}
