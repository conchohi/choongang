package assignment02;

import java.util.Scanner;

public class Exam02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = {79,88,33,100,50,90};
		
		System.out.print("배열에서 찾는 값을 입력하세요 >> ");
		int target = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < score.length; i++) {
			if(target == score[i]) {
				System.out.println("찾는 값 : " + target);
				System.out.println("배열의 요소 위치 : " + i);
				System.exit(0);
			}
		}
		System.out.println("찾는 값이 없습니다.");

	}

}
