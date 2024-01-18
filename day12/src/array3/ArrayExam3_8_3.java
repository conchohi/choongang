package array3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayExam3_8_3 {
	//#1. Scanner 객체 생성 - 모든 메소드에서 사용하기 위해
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//#2. 변수 선언
		String[] beverage = {"아메리카노","라떼","콜라","홍차"}; //음료 종류
		int[] price = {2500,4500,1500,5500}; //음료 가격
		int[] numberOfOrders = new int[4]; //주문 수량을 누적할 변수
		int[] amountOfMoney = new int[4];
		int continueingOrNot = 0; //주문 계속할지 여부
		int totalPaymentAmount = 0; // 총 주문금액을 담을 변수
		int beverageChoice = 0; //음료 선택 번호를 담을 변수
		int totalOrderAmount = 0;
		
		//금액과 수량 형식 지정
		DecimalFormat f1 = new DecimalFormat("0잔");
		DecimalFormat f2 = new DecimalFormat("##,##0원");
		
		//#3. 음료 판매 시작
		while(true) {	
			int idx = 0;
			//주문 받는 메세지 출력
			System.out.println("음료 번호를 선택하세요...");
			System.out.println("========================================================");
			System.out.println("1.아메리카노(2500)|2.라떼(4500)|3.콜라(1500)|4.홍차(5500)|0.종료");
			System.out.println("========================================================");
			System.out.print("음료 선택 >> ");
			//선택한 번호를 변수에 담기
			beverageChoice = sc.nextInt();
			
			//종료를 선택했을 때 프로그램을 종료
			if (beverageChoice == 0) {
				//break; - 반복문을 종료
				System.out.println("주문을 종료합니다.");
				break;
			} else if(beverageChoice <= 4){
				idx = beverageChoice - 1;
			} else {
				System.out.println("음료 번호를 잘못 입력했습니다. 다시 시도해주세요");
				continue;
			}
			System.out.println();
			System.out.print("주문 수량을 입력 >> ");
			int numbers = sc.nextInt();
			numberOfOrders[idx] += numbers; //주문 수량 누적
			amountOfMoney[idx] = numberOfOrders[idx] * price[idx]; //금액 누적
//			amountOfMoney[idx] += numbers * price[idx]; //금액 누적
		
			System.out.println();
			
			//주문을 계속할지 여부 묻기
			System.out.println("주문을 계속하시겠습니까?");
			System.out.println("=========================");
			System.out.println("1: 주문계속 | 2: 주문종료");
			System.out.println("=========================");
			System.out.print("번호 선택 >> ");
			continueingOrNot = sc.nextInt();
			if(continueingOrNot == 2) {
				System.out.println("주문을 종료합니다.");
				break;
			}//end of if
			System.out.println();
		}//end of while
		//결제할 금액을 계산하고 주문 수량을 계산하고 출력하기
		System.out.println("==========================");
		System.out.println("음료명\t주문수량\t주문금액");
		System.out.println("==========================");
		//수량과 개별 금액을 출력 배열 공간에 있는 값을 꺼내서 출력
		//배열은 시작과 끝이 있고, 시작 ~ 끝까지 검토한 후 출력
		//for문
		//만약 주문이 없을 시 그것을 출력하지 못하게 할 필요 : if문
		// 			주문 수량이 0(또는 주문 금액이 0)이면 출력에서 제외 
		for(int i = 0; i < beverage.length; i++) {
			//음료와 주문 수량과 개별 음료 주문 금액을 출력
			//한번도 주문하지 않은 것은 제외 시켜야 함
			if(numberOfOrders[i] > 0) {	
				System.out.printf("%s\t%s\t%s\n", beverage[i],
						f1.format(numberOfOrders[i]),f2.format(amountOfMoney[i])
						);
				//주문 수량 합계 계산
				totalOrderAmount += numberOfOrders[i];
				//결제 금액 총액 계산
				totalPaymentAmount += amountOfMoney[i];
			}//end of if
		}//end of for
		System.out.println("=========================");
		//총 주문 수량 합계와 총 결제 금액 출력
		System.out.println("주문 수량 합계 : " + f1.format(totalOrderAmount));
		System.out.println("총 결제 금액  : " + f2.format(totalPaymentAmount));
		sc.close();
	}//end of main


}
