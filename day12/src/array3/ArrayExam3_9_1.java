package array3;

import java.util.Scanner;

public class ArrayExam3_9_1 {
	public static void main(String[] args) {
		//#1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//#2. 변수 선언 및 초기화
//		String[] fruitEng = {"Apple","Banana","Melon","Peach","Grape","Strawberry","Pear","Mango","Plum"};
//		String[] fruitKor = {"사과","바나나","멜론","복숭아","포도","딸기","배","망고","자두"};
		String[][] fruits = {
				{"Apple","사과"},
				{"Watermelon","수박"},
				{"Peach","복숭아"},
				{"Strawberry","딸기"},
				{"tangerine","귤"}
				};
		int correct = 0;
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.println("\"" + fruits[i][0] + "\"의 한국어 과일 이름은?");
			String userResponse = sc.nextLine();
			if(userResponse.equals(fruits[i][1])) {
				System.out.println("정답입니다.");
				correct++;
			} else {
				System.out.println("오답입니다.");
				System.out.println("정답은 '" + fruits[i][1] + "'입니다.");
			}
		}
		System.out.println("총 " + correct + "문제를 맞추셨습니다.");
		sc.close();
	}

}
