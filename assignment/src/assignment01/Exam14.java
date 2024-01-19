package assignment01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam14 {

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
		
		String result = (avg >= 80) ? "합격" : "불합격";
		DecimalFormat f = new DecimalFormat("##0.0");
		
		System.out.println("-----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t판정");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%s\t%s\n", name, kor, eng, math, sum, f.format(avg), result);
		System.out.println("-----------------------------------------------------");
		
		sc.close();
		
	}

}
