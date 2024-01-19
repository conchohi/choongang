package assignment02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] beverage = {"아메리카노","라떼","콜라","홍차"};
		int[] price = {2500,4500,1500,5500};
		int[] numberOfOrders = new int[4];
		int[] amountOfMoney = new int[4];
		
		while(true) {
			int idx = 0;
			System.out.println("음료 번호를 선택하세요....");
			System.out.println("=========================================================");
			System.out.println("1.아메리카노(2500)|2.라떼(4500)|3.콜라(1500)|4.홍차(5500)|0. 종료 ");
			System.out.println("=========================================================");
			System.out.print("음료 선택 >> ");
			int beverageChoice = sc.nextInt();
			if(beverageChoice == 0) {
				System.out.println("주문을 종료합니다.");
				System.exit(0);
			} else if(beverageChoice <= 4) {
				idx = beverageChoice - 1;
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
				continue;
			}
			System.out.print("주문 수량을 입력 >> ");
			int numbers = sc.nextInt();
			
			numberOfOrders[idx] += numbers;
			amountOfMoney[idx] = numberOfOrders[idx] * price[idx];
			System.out.println();
			
			System.out.println("주문을 계속하시겠습니까?");
			System.out.println("=========================");
			System.out.println("1. 주문계속 | 2. 주문종료");
			System.out.println("=========================");
			System.out.print("선택 >> ");
			System.out.println();
			
			int continuingOrNot = sc.nextInt();
			if(continuingOrNot == 2) {
				System.out.println("주문을 종료합니다.");
				System.out.println();
				break;
			}
		}//end of while
		DecimalFormat f = new DecimalFormat("#,##0원");
		int totalPaymentAmount = 0;
		int totalOrderAmount = 0;
		System.out.println("===============================");
		System.out.println("음료명\t주문수량\t주문금액");
		System.out.println("===============================");
		for(int i = 0; i < beverage.length; i++) {
			if(numberOfOrders[i] > 0) {
				System.out.printf("%s\t%d잔\t%s\n", beverage[i], numberOfOrders[i], f.format(amountOfMoney[i]));
				totalPaymentAmount += amountOfMoney[i];
				totalOrderAmount += numberOfOrders[i];
			}
		}
		System.out.println("===============================");
		System.out.println("주문 수량 합계 : " + totalOrderAmount + "잔");
		System.out.println("결제 금액 총계 : " + f.format(totalPaymentAmount));
		sc.close();
		
	}//end of main

}
