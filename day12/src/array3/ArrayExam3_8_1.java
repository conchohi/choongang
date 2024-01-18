package array3;

import java.util.Scanner;

public class ArrayExam3_8_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String[] beverages = new String[4];
		int[] quantitys = new int[4];
		int[] prices = new int[4];
		while(true) {
			int price = 0;
			
			System.out.println("음료 번호를 선택하세요");
			System.out.println("1.아메리카노(2500)|2.라떼(4500)|3.콜라(1500)|4.홍차(5500)|0.주문 취소 >>");
			int option = Integer.parseInt(sc.nextLine());
			
			if(option == 0) {
				System.out.println("주문을 종료합니다.");
				break;
			} else if(option == 1) {
				beverages[count] = "아메리카노";
				price = 2500;
			} else if(option == 2) {
				beverages[count] = "라떼";
				price = 4500;				
			} else if(option == 3) {
				beverages[count] = "콜라";
				price = 1500;								
			} else if(option == 4) {
				beverages[count] = "홍차";
				price = 5500;				
			} else {
				System.out.println("음료 번호를 잘못 입력했습니다. 다시 시도해주세요");
				continue;
			}
			System.out.println("주문 수량을 입력 >>");
			quantitys[count] = Integer.parseInt(sc.nextLine());
			prices[count] = quantitys[count] * price;
			count++;
			System.out.println("주문을 계속하시겠습니까?");
			System.out.println("Y: 주문계속 | N : 주문 취소");
			if(sc.nextLine().equals("N")) {
				System.out.println("주문을 종료합니다.");
				break;
			}

		}
		int totalPrice = 0;
		System.out.println("==================================");
		for(int i = 0; i < count; i++) {
			System.out.printf("%5s  /  %2d잔 주문  /  주문금액 : %5d\n", beverages[i],quantitys[i],prices[i]);
			totalPrice += prices[i];
		}
		System.out.println("==================================");
		System.out.println("총 주문 금액 : " + totalPrice);
		sc.close();
	}

}
