package assignment01;

import java.util.Scanner;

public class ScannerExam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >> ");
		String name = sc.nextLine();
		System.out.print("전화번호를 입력하세요 >> ");
		String phone = sc.nextLine();
		System.out.print("주소를 입력하세요 >> ");
		String address = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + address);
		sc.close();
	}

}
