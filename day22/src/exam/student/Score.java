package exam.student;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//#1. 학생 수 입력받아 배열 공간 확보
		System.out.println("학생 수를 입력 >> ");
		int studentNumber = Integer.parseInt(sc.nextLine());
		
		//배열 공간 확보
		//이름과 학과 배열공간 설정
		String[][] nameMajor = new String[studentNumber][2];
		
		//db, sw, pg 점수 입력할 공간 확보
		int[][] scores = new int[studentNumber][3];
		
		//개별 합계, 평균, 학점, 석차 담을 공간 확보
		int[] sum = new int[studentNumber];
		double[] avg = new double[studentNumber];
		String[] grade = new String[studentNumber];
		int[] rank = new int[studentNumber];
		
		//이름과 학과를 한번에 받아서 처리
		for(int i = 0; i < studentNumber; i++) {
			//이름 : nameMajor[i][0], 학과 : nameMajor[i][1]
			System.out.println("이름과 학과를 입력하세요 >> ");
			nameMajor[i][0] = sc.nextLine();
			nameMajor[i][1] = sc.nextLine();
			System.out.println();
		}
		//성적 입력받아 처리
		System.out.println("성적 입력 >> ");
		
		for(int i = 0; i < scores.length; i++) {
			//개인별로 합계와 평균, 석차 처리
			int personalSum = 0;
			double personalAvg = 0.0;
			rank[i] = 1;
			System.out.println(nameMajor[i][0] + "의 성적 입력");
			System.out.println("DB, SW, PG 순으로 입력 >> ");
			for(int j = 0; j < scores[i].length; j++) {
				//DB : scores[i][0], SW : scores[i][1], PG : scores[i][2]  
				scores[i][j] = Integer.parseInt(sc.nextLine());
				//개별 합계
				personalSum += scores[i][j];
			}//end of inner for
			System.out.println();
			//개별 평균
			personalAvg = (double)personalSum / scores[i].length;
			sum[i] = personalSum;
			avg[i] = personalAvg;
			
			//학점 구하기
			if(avg[i] >= 90) {
				grade[i] = "A";
			} else if(avg[i] >= 80) {
				grade[i] = "B";
			} else if(avg[i] >= 70) {
				grade[i] = "C";
			} else if(avg[i] >= 60) {
				grade[i] = "D";
			} else {
				grade[i] = "F";
			}//end of if
		}//end of outer for
		
		//석차 구하기
		for(int i = 0; i < avg.length; i++) {
			for(int j = 0; j < avg.length; j++) {
				if(avg[i] > avg[j]) {
					rank[j]++;
				}//end of if
			}//end of for
		}//end of for
		
		System.out.println("=============================================================================");
		System.out.println(" 번호\t 이름\t 학과\t DB\t SW\t PG\t 합계\t 평균\t 학점\t 석차");
		System.out.println("=============================================================================");
		
		for(int i = 0; i < studentNumber; i++) {
			//번호 : i + 1
			System.out.print((i+1) + "\t");
			
			//이름과 학과
			for(int j = 0; j < nameMajor[i].length; j++) {
				System.out.print(nameMajor[i][j] + "\t");
			}
			
			//과목별 성적
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			
			//합계
			System.out.print(sum[i] + "\t");
			//평균
			System.out.printf("%.2f\t",avg[i]);
			//학점
			System.out.print(grade[i] + "\t");
			//석차
			System.out.println(rank[i] + "\t");
		}//end of for
		
		System.out.println("--------------------");
		System.out.println("# 개인 성적을 보고 싶은 학생의 번호 입력 >> ");
		int no = Integer.parseInt(sc.nextLine());
		int i = no - 1;
		if(i < studentNumber) {
			System.out.println("*** " + nameMajor[i][0] + "의 개인 성적표 ***");
			System.out.println("=============================================================================");
			System.out.println(" 번호\t 이름\t 학과\t DB\t SW\t PG\t 합계\t 평균\t 학점\t 석차");
			System.out.println("=============================================================================");
			//번호 : i + 1
			System.out.print((i+1) + "\t");
			
			//이름과 학과
			for(int j = 0; j < nameMajor[i].length; j++) {
				System.out.print(nameMajor[i][j] + "\t");
			}
			//과목별 성적
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			
			//합계
			System.out.print(sum[i] + "\t");
			//평균
			System.out.printf("%.2f\t",avg[i]);
			//학점
			System.out.print(grade[i] + "\t");
			//석차
			System.out.println(rank[i] + "\t");
		}//end of if
		
		
		sc.close();
	
		
	}//end of main

}
