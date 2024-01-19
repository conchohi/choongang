package assignment02;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = null;
		int studentNum = 0;
		
		while(true) {
			System.out.println("==================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("==================================================");
			System.out.print("번호 선택 >> ");
			int option = sc.nextInt();
			
			if(option == 1) {
				System.out.print("학생 수 입력 >> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			} else if(option == 5) {
				System.out.println("종료 선택하셨습니다.");
				break;
			} else if(studentNum == 0) {
				System.out.println("학생 수 먼저 입력해주세요.");
			} else if(option == 2) {
				for(int i = 0; i < studentNum; i++) {
					System.out.printf((i+1) + "번째 학생 점수 입력 >> ");
					scores[i] = sc.nextInt();
				}
			} else if(option == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println((i+1) + "번 학생 점수 = " + scores[i]);
				}
			} else if(option == 4) {
				int max = scores[0];
				int min = scores[0];
				int sum = 0;
				double avg = 0.0;
				
				for(int i = 0; i < studentNum; i++) {
					if(max < scores[i]) {
						max = scores[i];
					} 
					if(min > scores[i]) {
						min = scores[i];
					}
					sum += scores[i];
				}
				avg = (double)sum / studentNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("최저 점수 : " + min);
				System.out.printf("평균 : %.2f\n", avg);
			}
			System.out.println();
		}//end of while
		System.out.println("종료합니다.");
		
		sc.close();
	}//end of main

}
