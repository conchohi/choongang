package array3;

import java.util.Scanner;

public class ArrayExam3_8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] beverages = {"아메리카노","라떼","콜라","홍차"};
		int[] price = {2500,4500,11500,5500};
		int[] quantitys = new int[4];
		int[] prices = new int[4];
		while(true) {			
			System.out.println("음료 번호를 선택하세요");
			System.out.println("1.아메리카노(2500)|2.라떼(4500)|3.콜라(1500)|4.홍차(5500)|0.주문 취소 >>");
			int idx = getIndex(Integer.parseInt(sc.nextLine()));
			if(idx == 4) {
				System.out.println("음료 번호를 잘못 입력했습니다. 다시 시도해주세요");
				continue;
			}
			System.out.println("주문 수량을 입력 >>");
			quantitys[idx] = Integer.parseInt(sc.nextLine());
			prices[idx] = quantitys[idx] * price[idx];
			System.out.println("주문을 계속하시겠습니까?");
			System.out.println("Y: 주문계속 | N : 주문 취소");
			if(sc.nextLine().equals("N")) {
				System.out.println("주문을 종료합니다.");
				break;
			}

		}
		int totalPrice = 0;
		System.out.println("==================================");
		for(int i = 0; i < beverages.length; i++) {
			if(quantitys[i] > 0) {	
				System.out.printf("%5s  /  %2d잔 주문  /  주문금액 : %5d\n", beverages[i],quantitys[i],prices[i]);
				totalPrice += prices[i];
			}
		}
		System.out.println("==================================");
		System.out.println("총 주문 금액 : " + totalPrice);
		sc.close();
	}
	public static int getIndex(int option) {
		if(option == 1) {
			return 0;
		} else if (option == 2) {
			return 1;
		} else if (option == 3) {
			return 2;
		} else if (option == 4) {
			return 3;
		} else {
			return 4;
		}
	}

}
