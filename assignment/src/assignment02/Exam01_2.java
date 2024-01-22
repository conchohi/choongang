package assignment02;

import java.util.Scanner;

public class Exam01_2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int studentNum = 5;
		int[] score = new int[studentNum];
		String[] studentName = new String[studentNum];

		for(int i = 0; i < studentName.length; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요 >> ");
			studentName[i] = sc.nextLine();
			System.out.print((i+1) + "번째 학생의 성적을 입력하세요 >> ");
			score[i] = Integer.parseInt(sc.nextLine());
			System.out.println();
		}
		
		System.out.println("=======================");
		System.out.println("번호\t이름\t성적\t");
		System.out.println("=======================");
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d\t%s\t%d\n", (i+1),studentName[i],score[i]);
		}
		
		printScoreInfo(score);
	}
	
	public static int getSum(int[] arr) {
		int sum = 0;
		for(int n : arr) {
			sum += n;
		}
		return sum;
	}
	public static void printScoreInfo(int[] arr) {
		int sum = getSum(arr);
		double avg = (double)sum / arr.length;
		System.out.println("=======================");
		System.out.println("인원수 : " + arr.length + "명");
		System.out.println("전체 합계 : " + sum);
		System.out.printf("전체 평균 : %.2f\n", avg);
	}

}
