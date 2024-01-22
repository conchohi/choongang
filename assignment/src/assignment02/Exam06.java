package assignment02;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		
		printNumArray(num);
		
		sc.close();
	}
	
	public static void printNumArray(int num) {
		int count = 1;
		for(int i = 0; i < num; i++) {
			System.out.print((i+1) + "=>");
			for(int j = 0; j < num; j++) {
				System.out.printf("%4d", count);
				count += num;
			}
			System.out.println();
		}
	}

}
