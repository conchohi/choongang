package array2;

import java.text.DecimalFormat;

public class Array2_1_2 {

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
		
		int[] score = {100, 88,100,90,50};
		String[] studentName = {"홍길동","김자바","이자바","박디비","송디비"};
		int count = 0;
		int sum = 0;
		double avg = 0.0;
		DecimalFormat f = new DecimalFormat("#0.00");
		
		//#2. 계산
//		for(int s : score) {
//			sum += s;
		for(int i = 0; i < score.length; i++) {
			count++; //인원수
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
//		System.out.println("인원수 : " + score.length);
		System.out.println("인원수 : " + count);
		System.out.println("전체 합계 : " + sum);
//		System.out.printf("전체 평균 : %.2f", avg);	
		System.out.printf("전체 평균 : " + f.format(avg));	
		
	}

}
