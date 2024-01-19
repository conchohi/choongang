package assignment01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ScannerExam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변을 입력하세요 >> ");
		int base = sc.nextInt();
		System.out.print("높이를 입력하세요 >> ");
		int height = sc.nextInt();
		
		double area = base * height / 2.0;
		DecimalFormat f = new DecimalFormat("##0.##");
		
		System.out.println("삼각형의 밑변 : " + base);
		System.out.println("삼각형의 높이 : " + height);
		System.out.println("삼각형의 넓이 : " + f.format(area));
		
		sc.close();
	}

}
