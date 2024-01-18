package exam.bookexam;

import java.util.Scanner;

public class BookExam4_7_refect2 {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//#2. 변수 선언
		boolean run = true; //while의 조건 설정
		int balance = 0; //실제론 long(21억 이상 존재 가능성)
		int deposit = 0;
		int withdraw = 0;
		
		while(run) {
			
			//#3. 공동 출력 부분
			System.out.println("------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			
			//#4. 선택한 번호를 읽어오기
			int option = Integer.parseInt(sc.nextLine());

			//#5. 읽어온 번호를 이용해 처리
			if(option == 1) {
				System.out.print("예금액 > ");
				deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
			} else if(option == 2) {
				System.out.print("출금액 > ");
				withdraw = Integer.parseInt(sc.nextLine());
				if(balance < withdraw) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance -= withdraw;
				}
			} else if(option == 3) {
				System.out.println("잔고 > " + balance);
			} else if(option == 4) {
//				run = false;
//				System.exit();
				break; //if {} 을 제외한 자신을 감싸고 있는 가장 가까운 반복문을 빠져나간다.
			}else {
				System.out.println("숫자를 잘못 입력했습니다.");
			}
			System.out.println(); //줄바꿈
			
		}//end of while
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
