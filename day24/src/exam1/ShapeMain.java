package exam1;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		//몇개의 도형을 그리고 싶은가?
		//선택한 도형 만큼 그리기
		//선택한 도형에 해당하는 객체 생성
		
		//#1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//#2. 지역 변수
		int num = 0; //그림을 그릴 도형의 개수
		Shape[] shapes = null; //입력받은 도형 객체 저장할 배열
		
		//#3. 그릴 도형의 개수 입력받기
		System.out.println("그림을 그릴 도형의 개수 입력 >> ");
		num = sc.nextInt();
		
		//#4. 입력받은 개수 만큼의 도형을 저장할 공간 설정
		shapes = new Shape[num]; //자식이 부모에 담김
		
		for(int i = 0; i < num; i++) {
			//#5. 그리려는 도형 선택
			int selectType = 0;
			do {
				System.out.println("-------------------------------");
				System.out.println((i+1) + ") 그리려는 도형 선택");
				System.out.println("1.점 | 2.수평선 | 3.수직선 | 4.사각형");
				System.out.println("-------------------------------");
				System.out.print("번호 선택 >> ");
				selectType = sc.nextInt();
			}while(selectType < 1 || selectType > 4);
			
			//#1. 도형을 배열에 저장
			switch(selectType) {
			case 1 :
				shapes[i] = new Point();
				break;
			case 2 : 
			case 3 :
				System.out.print("선의 길이 입력 >> ");
				int len = sc.nextInt();
				shapes[i] = (selectType == 2) ? new HorizonLine(len) : new VerticalLine(len);
				break;
			case 4 :
				System.out.print("사각형의 가로 길이 입력 >> ");
				int width = sc.nextInt();
				System.out.print("사각형의 세로 길이 입력 >> ");
				int height = sc.nextInt();
				shapes[i] = new Rectangle(width, height);
				break;
			}//end of switch
				
		}//end of for
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		
		//도형 그리기
		for (Shape shape : shapes) {
			shape.printDraw();
		}
		
		sc.close();
		
		
	}//end of main

}
