package assignment01;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("출력된 숫자 : " + num * 2);
		} else {
			System.out.println("출력된 숫자 : " + num);
		}
		
		sc.close();
		
	}

}
