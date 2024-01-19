package assignment02;

public class Exam01_1 {

	public static void main(String[] args) {
		int[] score = {100, 88,100,90,50};
		String[] studentName = {"홍길동","김자바","이자바","박디비","송디비"};
		
		int sum = 0;
		double avg = 0.0;
		
		System.out.println("=======================");
		System.out.println("번호\t이름\t성적\t");
		System.out.println("=======================");
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d\t%s\t%d\n", (i+1),studentName[i],score[i]);
			sum += score[i];
		}
		avg = (double)sum / studentName.length;
		System.out.println("=======================");
		System.out.println("인원수 : " + studentName.length + "명");
		System.out.println("전체 합계 : " + sum);
		System.out.printf("전체 평균 : %.2f\n", avg);
	}

}
