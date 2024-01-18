package conditional;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IfExam06 {

	public static void main(String[] args) {
		/*
		문6) 이름, 국어, 영어, 수학 점수를 입력받아서
			합계와 평균을 구하고, 평균이 80점 이상이면 "합격"
			그렇지 않으면 "불합격"으로 처리하시오
		 */
		Scanner sc = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0.0;
		String result = "";
		DecimalFormat f = new DecimalFormat("#,##0.##");

		System.out.print("이름을 입력하세요 >> ");
		name = sc.nextLine();
		System.out.print("국어 점수를 입력하세요 >> ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 >> ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 >> ");
		math = sc.nextInt();

		sum = kor+eng+math;
		avg = sum / 3.0;
		
		if(avg >= 80) {
			result = "합격";
		} else {
			result = "불합격";
		}
		System.out.println("** " + name + "의 성적 **");
		System.out.println("-------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t판정");
		System.out.println("-------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%s\t%s\n", name, kor, eng, math, sum, f.format(avg), result);
		System.out.println("-------------------------------------------------------");
		sc.close();
	}

}
