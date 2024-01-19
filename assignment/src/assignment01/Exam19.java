package assignment01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 0;
		DecimalFormat f = new DecimalFormat("##,##0원");
		
		System.out.println("주문할 음료를 선택하세요 >> ");
		System.out.print("[1.커피, 2.라떼, 3.콜라, 4.녹차] >> ");
		int option = sc.nextInt();
		String beverage = "";
		switch(option) {
		case 1 : 
			price = 3500;
			beverage = "커피";
			break;
		case 2 :
			price = 5500;
			beverage = "라떼";
			break;
		case 3 :
			price = 1500;
			beverage = "콜라";
			break;
		case 4 :
			price = 3500;
			beverage = "녹차";
			break;
		}
		System.out.print("주문 수량을 입력하세요 >> ");
		int quantity = sc.nextInt();
		int totalPrice = price * quantity;
		
		
		System.out.println("주문한 음료 : " + beverage);
		System.out.println("주문 수량 : " + quantity);
		System.out.println("결제 금액 : " + f.format(totalPrice));
		sc.close();
	}

}
