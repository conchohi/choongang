package loop;

import java.util.Scanner;

public class bookExam4_2_7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			
			int option = sc.nextInt();

			if(option == 1) {
				System.out.print("예금액 > ");
				balance += sc.nextInt();
			} else if(option == 2) {
				System.out.print("출금액 > ");
				int withdraw = sc.nextInt();
				if(balance < withdraw) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance -= withdraw;
				}
			} else if(option == 3) {
				System.out.println("잔고 > " + balance);
			} else if(option == 4) {
				System.out.println();
				break;
			}else {
				System.out.println("숫자를 잘못 입력했습니다.");
			}
			System.out.println();		
			
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
