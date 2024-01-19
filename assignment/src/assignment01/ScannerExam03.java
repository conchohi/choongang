package assignment01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScannerExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >> ");
		String name = sc.nextLine();
		System.out.print("국어 점수를 입력하세요 >> ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수를 입력하세요 >> ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수를 입력하세요 >> ");
		int math = Integer.parseInt(sc.nextLine());
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		DecimalFormat f = new DecimalFormat("##0.0");
		
		System.out.println("** " + name + "의 성적 **");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + f.format(avg));
		
		sc.close();
	}

}
