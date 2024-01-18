package method;

import java.util.Scanner;

public class PrintExam {
	
	public static int paperNumber = 100;
	
	public static void main(String[] args) {
		// 초기 용지 : 100장, paperNumber
		// 인쇄방식 : 단면(true)과 양면(false) : boolean printMethod
		//			양면 = 인쇄할 매수 % 2 == 0 -> 인쇄매수 /2
		//				  인쇄할 매수 % 2 == 1 -> 인쇄매수 / 2  + 1
		// 인쇄할 매수를 입력 받기
		// 출력형태
		// ~장 출력
		// 남은 용지매수 : ~장
		
		Scanner sc = new Scanner(System.in);
		System.out.println("프린트를 시작합니다.");
		while(true) {
			System.out.print("인쇄 방식 선택 (1. 단면, 2. 양면) >> ");
			int printMethod = Integer.parseInt(sc.nextLine());
			System.out.print("몇 페이지를 인쇄하시겠습니까? >> ");
			int printAmount = Integer.parseInt(sc.nextLine());
			printPage(printMethod, printAmount);
			
			if(paperNumber == 0) {
				System.out.println("용지가 없습니다.");
				break;
			}
			System.out.print("종료하시겠습니까? (예, 아니요) >> ");

			if(sc.nextLine().equals("예")) {
				break;
			}
		}
		System.out.println("프린트를 종료합니다.");
		sc.close();

	}
	public static void printPaper(int printAmount) {
		if(paperNumber >= printAmount) {
			paperNumber -= printAmount;
			System.out.println("총 " + printAmount + "장 출력");
			System.out.println("남은 용지매수 : " + paperNumber +"장");
		} else if(paperNumber == 0){
			System.out.println("용지가 없습니다.");
		} else {
			System.out.println("용지 부족 : " + (printAmount - paperNumber));
			System.out.println(paperNumber + "장만 인쇄");
			paperNumber = 0;
		}
	}
	
	
	public static void printPage(int printMethod, int printAmount) {
		if(printMethod == 2) {
			printAmount = (int)Math.ceil(printAmount / 2.0);
		}
		printPaper(printAmount);
	}

}
