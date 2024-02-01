package exam.shape;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		//#1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//#2. 지역 변수 - main 메소드 안에서 선언
		Shape shape = null;
		
		while(true) {
			//그리려는 도형을 선택 -> 선의 길이
			//선택한 도형에 해당하는 객체 생성
			System.out.println("==============================");
			System.out.println("0.종료|1.점|2.수직선|3.수평선|4.사각형");
			System.out.println("==============================");
			System.out.print("어떤 도형을 그릴지 선택하세요 >> ");
			int option = sc.nextInt();
			
			if(option == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else if(option == 1) {
				shape = new Point();
			} else if(option == 2) {
				System.out.print("길이를 입력하세요 >> ");
				int length = sc.nextInt();
				shape = new VerticalLine(length);
			} else if(option == 3) {
				System.out.print("길이를 입력하세요 >> ");
				int length = sc.nextInt();
				shape = new HorizonLine(length); 
			} else if(option == 4) {
				System.out.println("가로 길이를 입력하세요 >> ");
				int width = sc.nextInt();
				System.out.println("세로 길이를 입력하세요 >> ");
				int length = sc.nextInt();
				shape = new Rectangle(width, length);
			} else {
				System.out.println("숫자를 잘못 입력했습니다.");
				break;
			}
			
			shape.printDraw();
			System.out.println();
		}
		sc.close();
	}

}
