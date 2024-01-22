package assignment02;

import java.util.Scanner;

public class Exam07 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
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
				inputScore(scores);
			} else if(option == 3) {
				printScore(scores);
			} else if(option == 4) {
				int max = getMax(scores);
				int min = getMin(scores);
				int sum = getSum(scores);
				double avg = 0.0;

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
	public static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int n : arr) {
			if(max < n) {
				max = n;
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for(int n : arr) {
			if(min > n) {
				min = n;
			}
		}
		return min;
	}
	public static int getSum(int[] arr) {
		int sum = 0;
		for(int n : arr) {
			sum += n;
		}
		return sum;
	}
	public static void inputScore(int[] scores) {
		for(int i = 0; i < scores.length; i++) {
			System.out.printf((i+1) + "번째 학생 점수 입력 >> ");
			scores[i] = sc.nextInt();
		}
	}
	public static void printScore(int[] scores) {
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번 학생 점수 = " + scores[i]);
		}
	}

}
