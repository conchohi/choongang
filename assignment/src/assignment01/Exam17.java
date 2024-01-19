package assignment01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#,##0원");
		System.out.print("수량을 입력하세요 >> ");
		int price = Integer.parseInt(sc.nextLine()) * 4500;
		System.out.print("영수증이 필요하다면 '영수증'을 입력하세요 >> ");
		String result = "";
		if(sc.nextLine().equals("영수증")) {
			result = "여기 있습니다.";
		} else {
			result = "없습니다.";
		}
		
		System.out.println("금액은 " + f.format(price) + "입니다");
		System.out.println("영수증 " + result);
		
		
		sc.close();
	}

}
