package scanner;

import java.util.Scanner;

public class ScannerExam01 {

	public static void main(String[] args) {
		//#1. 스캐너라는 클래스를 사용해서 스캐너 객체를 생성
		Scanner scan = new Scanner(System.in);
		//#2. 변수 선언
		String name = "";
		int kor = 0;
		double avg = 0.0;
		
		//#3. 안내문구
		System.out.print("이름을 입력 >> ");
		//#4. 객체(인스턴스)에 담긴 값을 읽어오기
		name = scan.nextLine(); //scan이 가리키는 곳(주소)에 가서 문자열 가져와서 name 변수에 담기
		
		System.out.print("국어점수 입력 >> ");
		kor = scan.nextInt(); //scan이 가리키는 주소로가서 정수를 가져와서 kor 변수에 담기
		
		System.out.print("평균을 입력 >> ");
		avg = scan.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + kor);
		System.out.println("평균 : " + avg);
		
		scan.close();
		
		
		
	}

}
