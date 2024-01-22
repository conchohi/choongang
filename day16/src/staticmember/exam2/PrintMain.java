package staticmember.exam2;

import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Print print = new Print();
		
		while(true) {
			System.out.println("---------------------------");
			System.out.println("1.출력 | 2.용지 확인 | 3.충전 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("입력 >> ");
			int option = sc.nextInt();
			
			if(option == 1) {
				System.out.print("인쇄할 매수를 입력하세요. >> ");
				int printAmount = sc.nextInt();
				System.out.print("출력 방식을 선택해주세요 (1.단면 | 2.양면) >> ");
				int printingMethod = sc.nextInt();
				print.printShow(printAmount, printingMethod);
			} else if(option == 2) {
				System.out.println("현재 남은 용지는 " + print.getPaperNumber() + "장입니다.");;
			} else if(option == 3) {
				System.out.print("몇 장을 충전하시겠습니까? >> ");
				int charge = sc.nextInt();
				print.chargePaper(charge);
			} else if(option == 4) {
				System.out.println("프린터를 종료합니다.");
				break;
			} else {
				System.out.println("숫자를 잘못 입력하셨습니다.");
			}//end of if
		}//end of while
		sc.close();
	}//end of main

}
