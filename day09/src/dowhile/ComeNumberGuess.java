package dowhile;

import java.util.Scanner;

public class ComeNumberGuess {

	public static void main(String[] args) {
		//1~100사이의 임의의 값을 얻어서 answer에 저장한다
		
		//#1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//#2. 변수 선언
		int com = 0; //컴퓨터 값을 담을 변수
		int input = 0;
		int count = 0;
		
		//#3. 컴퓨터가 생각하는 값 만들기(1 ~ 100)
//		com = (int)(Math.random() * 100 + 1);
		//컴퓨터가 가지고 있는 값 확인 - 프로그램 확인 끝나면 주석 처리 또는 삭제
		System.out.println("com의 값 : " + com);
		
		do {
			count++;
			
			//4. 사용자로부터 값 입력받기
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = sc.nextInt();
			
			//#5. 컴퓨터의 값과 사용자의 값을 비교하는 작업
				// 컴퓨터 값 == 사용자 값, 컴퓨터 값 > 사용자 값, 컴퓨터 값 < 사용자 값
			if(input < com) {
				System.out.println(input + "보다 큽니다.");
			} else if(input > com) {
				System.out.println(input + "보다 작습니다.");
			} else {
				System.out.println(count + "번 만에 맞췄습니다.");
				break;
			}
			System.out.println();
		} while(true);
		
//		do {
//			count++;
//			
//			//4. 사용자로부터 값 입력받기
//			System.out.print("1과 100사이의 값을 입력하세요 : ");
//			input = sc.nextInt();
//			
//			if(input < com) {
//				System.out.println(input + "보다 큽니다.");
//			} else if(input > com) {
//				System.out.println(input + "보다 작습니다.");
//			}
//		} while(input != com);
//		System.out.println(count + "번 만에 맞췄습니다.");
		
		sc.close();
	}

}
