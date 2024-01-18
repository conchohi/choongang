package exam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WhileExam01 {

	public static void main(String[] args) {
		//문1) 홍길동이 음료를 마시기 위해 매장에 방문했습니다. 
		//	1. 메뉴를 선택(커피, 콜라, 라떼, 녹차)
		//		커피 : 3500, 콜라 : 1000, 라떼 : 5500, 녹차 : 4300
		//	2. 주문 수량
		//	3. 계속 주문 여부를 선택
		// 	4. 주문이 모두 끝나고 나면 
		//		주문한 음료 : ~~
		//		주문 수량 : ~~잔
		//		주문 금액 : ~~원
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int count = 0;
		int totalPrice = 0;
		String beverage = "";
		DecimalFormat f = new DecimalFormat("#,##0원");
		
		while(run) {
			System.out.print("메뉴를 선택하세요(1. 커피, 2. 콜라, 3. 라떼, 4. 녹차) >> ");
			int option = Integer.parseInt(sc.nextLine());
			int price = 0;
			switch(option) {
			case 1 :
				price = 3500;
				beverage += "커피 ";
				break;
			case 2 :
				price = 1000;
				beverage += "콜라 ";
				break;
			case 3 : 
				price = 5500;
				beverage += "라떼 ";
				break;
			case 4 :
				price = 4300;
				beverage += "녹차 ";
				break;
			default :
				System.out.println("숫자를 잘못 입력하셨습니다.");
				continue;
			}
			
			System.out.print("주문 수량을 선택하세요 >> ");
			int amount = Integer.parseInt(sc.nextLine());
			count += amount;
			totalPrice += price * amount;
			
			boolean runWhile = true;
			while(runWhile) {
				System.out.print("계속 주문하시겠습니까? (예, 아니오) >> ");
				String orderContinue = sc.nextLine();
				
				if(orderContinue.equals("예")){
					runWhile = false;
				} else if(orderContinue.equals("아니오")) {
					runWhile = false;
					run = false;
				} else {
					System.out.println("예, 아니오 중 하나를 입력하세요.");
				}
			}
		}
		System.out.println("주문한 음료 : " + beverage);
		System.out.println("주문한 수량 : " + count + "개");
		System.out.println("주문 금액 : " + f.format(totalPrice));
		sc.close();
	}

}
