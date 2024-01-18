package array3;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		while(run) {
			System.out.println("====================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
			System.out.println("====================================");
			switch(sc.nextInt()) {
			case 1 :
				break;
			case 2:
				break;
			case 3:
				System.out.println("잔액 : " + balance);
				break;
			}
		}
		sc.close();
	}

}
