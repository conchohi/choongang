package array3;

import java.util.Scanner;

public class ArrayExam3_6 {
	public static void main(String[] args) {
		//#1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//#2. 숫자 입력 받기
		System.out.println("숫자를 입력하세요 >> ");
		int num = sc.nextInt(); //행과 열 결정
		
		//#3. 행과 열에 값을 쓰기 위한 변수 선언
		int value = 1;
		
		//#4. 출력하기
		for(int i = 0; i < num; i++) {//행 방향 출력을 결정
			System.out.print((i+1) + "=>");
			for(int j = 0; j < num; j++) {//열 방향 출력을 결정
//				System.out.printf("%4d", (num*num)*i + num*j + 1);
				System.out.printf("%4d", value); //값을 출력
				value += num;// 입력 받은 숫자만큼 증가하기 위해
			}
			System.out.println();//줄바꿈
		}
		sc.close();
		
	}

}
