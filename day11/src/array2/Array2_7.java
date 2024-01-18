package array2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]student = new int[0];
		int studentNum = 0;
		boolean run = true;
		while(run) {
			System.out.println("=================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("=================================================");
			System.out.println("번호 선택 >> ");
			switch(sc.nextInt()) {
			case 1 :
				System.out.println("학생 수 입력 >> ");
				studentNum = sc.nextInt();
				student = new int[studentNum];
				break;
			case 2 :
				for(int i = 0; i < studentNum; i++) {
					System.out.println((i+1) + "번째 학생 점수 입력 >> ");
					student[i] = sc.nextInt();
				}
				break;
			case 3 :
				for(int i = 0; i < studentNum; i++) {
					System.out.println((i+1) + "번 학생 점수 = " + student[i]);
				}
				break;
			case 4 :
//				int min = Integer.MAX_VALUE;
//				int max = Integer.MIN_VALUE;
				int sum = 0;
				double avg = 0.0;
				DecimalFormat f = new DecimalFormat("#0.00");
//				for(int i = 0; i < studentNum; i++) {
//					min = Math.min(min, student[i]);
//					max = Math.max(max, student[i]);
//					sum += student[i];
//				}
				sum = getSum(student);
				avg = (double)sum / student.length;
				System.out.println("최고 점수 : " + getMax(student));
				System.out.println("최저 점수 : " + getMin(student));
				System.out.println("평균 : " + f.format(avg));
				break;
			case 5 :
				System.out.println("종료 선택하셨습니다.");
				run = false;
			}//end of switch
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
}
