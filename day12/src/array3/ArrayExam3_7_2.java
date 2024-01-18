package array3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayExam3_7_2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//#1. Scanner 객체 생성 - 입력 받기 위해
		
		//#2. 변수 선언 - 지역변수 {}안에서 사용
		int studentNum = 0;
		int[] scores = null;
		boolean run = true;
		
		while(run) {
			System.out.println("==================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("==================================================");

			System.out.println("번호 선택 >> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			if(selectNo == 1) {
				studentNum = getStudentNum();
				scores = new int[studentNum];
			} else if(selectNo == 5) {
				System.out.println("종료 선택하셨습니다");
				run = false;
			} else if(studentNum == 0) {
				System.out.println("학생 수를 먼저 입력하세요");
			} else if(selectNo == 2) {
				inputScore(scores);
			} else if(selectNo == 3) {
				scoreList(scores);
			} else if(selectNo == 4) {
				showPrint(scores);
			}
		}//end of while
		System.out.println("종료합니다.");
		sc.close();
	}//end of main
	public static int getStudentNum() {
		System.out.println("학생 수 입력 >> ");
		return Integer.parseInt(sc.nextLine());
	}
	
	public static void inputScore(int[] scores) {
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번째 학생 점수 입력 >>");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
	}
	
	public static void scoreList(int[] scores) {
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번 학생 점수 = " + scores[i]);
		}
	}
	
	public static int getMax(int[] scores) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < scores.length; i++) { 
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}
	public static int getMin(int[] scores) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < scores.length; i++) { 
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		return min;
	}
	
	public static int getSum(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) { 
			sum += scores[i];
		}
		return sum;
	}
	
	public static void showPrint(int[] scores) {
		int max = getMax(scores);
		int min = getMin(scores);
		int sum = getSum(scores);
		double avg = 0.0;
		DecimalFormat f = new DecimalFormat("#0.00");
		
		avg = (double)sum / scores.length;
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("평균 : " + f.format(avg));
	}
	
}
