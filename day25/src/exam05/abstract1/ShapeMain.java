package exam05.abstract1;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Shape[] shapes;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("그림을 그릴 도형의 개수 입력 >> ");
		int shapeNumber = sc.nextInt();
		
		shapes = new Shape[shapeNumber];
		
		for(int i = 0; i < shapeNumber; i++) {
			System.out.println("--------------------------------");
			System.out.println((i+1) + ") 그리려는 도형 선택");
			System.out.println("1.점 | 2.수평선 | 3.수직선 | 4.사각형");
			System.out.println("--------------------------------");
			int option = 0;
			do {
				System.out.print("번호 선택 >> ");
				option = sc.nextInt();
			} while(option < 1 || option > 4);
			
			int length = 0;
			
			switch(option){
			case 1 :
				shapes[i] = new Point();
				break;
			case 2 :
				System.out.print("길이를 입력하세요 >> ");
				length = sc.nextInt();
				shapes[i] = new HorizonLine(length);
				break;
			case 3 :
				System.out.print("길이를 입력하세요 >> ");
				length = sc.nextInt();
				shapes[i] = new VerticalLine(length);
				break;
			case 4 :
				System.out.print("가로 길이를 입력하세요 >> ");
				int width = sc.nextInt();
				System.out.print("세로 길이를 입력하세요 >> ");
				int height = sc.nextInt();
				shapes[i] = new Rectangle(width, height);
				break;
			}
		}
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		for (Shape shape : shapes) {
			shape.showInfo();
			shape.draw();
			System.out.println();
		}
		
		sc.close();
	}

}
