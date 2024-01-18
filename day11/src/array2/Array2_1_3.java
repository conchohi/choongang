package array2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array2_1_3 {

	public static void main(String[] args) {
		//문1) 다음은 홍길동반 학생들의 성적입니다. 총점과 평균을 구하는 프로그램을 작성하시오.
		//    성적(score) = {100, 88,100,90,50}
		//	  이름(studentName) = {"홍길동","김자바","이자바","박디비","송디비"}
		//출력 형태
		//==========================
		// 	번호		이름	 	성적
		//==========================
		//   1		홍길동 	100
		//   2		김자바  	88
		// ....
		//==========================
		// 인원수 : 5명
		// 전체 합계 : ??
		// 전체 평균 : ??.??
		
		int[] score = new int[5];
		String[] studentName = new String[5];
		int sum = 0;
		double avg = 0.0;
		DecimalFormat f = new DecimalFormat("#0.00");
		
		//#2. 입력
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < score.length; i++) {
//			System.out.print((i+1) + "번째 학생의 이름을 입력하세요 >> ");
//			studentName[i] = sc.nextLine();
//			System.out.print((i+1) + "번째 학생의 성적을 입력하세요 >> ");
//			score[i] = Integer.parseInt(sc.nextLine());
			System.out.println((i+1) + "번째 이름과 성적을 입력하세요 : ");
			studentName[i] = sc.nextLine();
			score[i] = Integer.parseInt(sc.nextLine());
		}
		
		//#3. 계산
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = (double)sum / score.length;
		
		//#3. 출력
		System.out.println("==========================");
		System.out.println("번호\t이름\t성적");
		System.out.println("==========================");
		
		for(int i = 0; i < score.length; i++) {
//			System.out.println(score); // score가 담고 있는 주소 출력
			System.out.printf("%d\t%s\t%3d\n",(i+1), studentName[i], score[i]);
		}
		
		System.out.println("==========================");
		System.out.println("인원수 : " + score.length);
		System.out.println("전체 합계 : " + sum);
//		System.out.printf("전체 평균 : %.2f", avg);	
		System.out.printf("전체 평균 : " + f.format(avg));	
		sc.close();
		
	}

}
