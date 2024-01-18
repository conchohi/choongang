package scanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScannerExam02 {

	public static void main(String[] args) {
		/*
		문1) 키보드로부터 이름, 국어, 영어, 수학점수를 입력받아
		  	 아래와 같이 출력하는 프로그램을 작성하시오.
		
		<출력형태>
		** 홍길동의 성적 **
		이름 : 홍길동
		국어 : 70
		영어 : 80
		수학 : 90
		합계 : 240
		평균 : 80.0
		 */
		//#1. Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
		//#2. 변수 선언
		String name = ""; //이름을 담을 변수
		int kor = 0; //국어
		int eng = 0; //영어
		int math = 0; //수학
		int sum = 0; //세 과목 합계
		double avg = 0.0; //세 과목 평균
		DecimalFormat dc1 = new DecimalFormat("#.###");

		//#3. 사용자에게 안내하는 문구
		System.out.print("이름을 입력하세요 : ");
		//#4. 사용자의 입력 대입
		name = scan.nextLine(); //scan을 가리키는 주소에 가서 문자열을 가져다 name 변수에 담기
		System.out.print("국어 점수를 입력하세요 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math = scan.nextInt();
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		//#3-1. 결과 출력 (세로)
		System.out.println("** " + name + "의 성적 **");
		System.out.println("이름 : " + name );
		System.out.println("국어 : " + kor );
		System.out.println("영어 : " + eng );
		System.out.println("수학 : " + math );
		System.out.println("합계 : " + sum );
		System.out.println("평균 : " + dc1.format(avg));
		System.out.println("===================================");
		
		//#3-2. 결과출력 (가로)
		System.out.println("** " + name + "의 성적 **");
		System.out.println("------------------------------");
		System.out.printf("국어\t영어\t수학\t합계\t평균\n");
		System.out.println("------------------------------");
		System.out.printf("%d\t%d\t%d\t%d\t%s\n", kor,eng,math,sum,dc1.format(avg));
	
		scan.close();
	}

}
