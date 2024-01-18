package exam.bookexam;

import java.util.Scanner;

public class BookExam4_7_refect {

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
			switch(option) 
			{
			case 1: 
				System.out.print("예금액 > "); 
				//잔고 = 기존잔고 + 현재 입금받은 예금액
				deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
				break;
			case 2: 
				System.out.print("출금액 > ");
				withdraw = Integer.parseInt(sc.nextLine());
				//잔고 = 기존잔고 - 현재 입력 출금액
				if(balance < withdraw) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance -= withdraw;
				}
				break;
				
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				//while문을 종료하기 위해 run = false 처리
				//현재 run에는 true가 담겨 있기에 false 수정해서
				//while문을 끝내려 함
				run = false; 
//				System.exit(0); //시스템을 강제 종료 -> main을 빠져나감
				break;
		
			default :
				System.out.println("숫자를 잘못 입력했습니다.");
				break;
			}//end of switch
			
			System.out.println(); //줄바꿈
			
		}//end of while
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
