package scanner;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class ScannerExam04 {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		//		System.out.println("이름을 입력 >> ");
//		String name = sc.nextLine();
		
		//#2. 변수 선언
		String name = "";
		int kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0.0;
//		DecimalFormat dc = new DecimalFormat("#.##");
		
		System.out.print("이름, 국어, 영어, 수학 점수 입력 >> ");
		name = sc.next(); //탭, 공란, 엔터로 구분
		kor = Integer.parseInt(sc.next()); //문자열형의 숫자를 정수로 변환
		eng = Integer.parseInt(sc.next()); //문자열형의 숫자를 정수로 변환
		math = Integer.parseInt(sc.next()); //문자열형의 숫자를 정수로 변환

		sum = kor + eng + math;
		avg = sum / 3.0; // avg = (double)sum / 3;
		
//		System.out.println("이름 : " + name);
//		System.out.println("국어 : " + kor);
//		System.out.println("영어 : " + eng);
//		System.out.println("수학 : " + math);
//		System.out.println("합계 : " + sum);
//		System.out.println("평균 : " + dc.format(avg));
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("----------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", 
				name, kor, eng, math, sum, avg);
		System.out.println("----------------------------------------------");
		sc.close();
		
	}

}
