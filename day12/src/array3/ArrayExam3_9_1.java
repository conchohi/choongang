package array3;

import java.util.Scanner;

public class ArrayExam3_9_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String[] fruitEng = {"Apple","Banana","Melon","Peach","Grape","Strawberry","Pear","Mango","Plum"};
//		String[] fruitKor = {"사과","바나나","멜론","복숭아","포도","딸기","배","망고","자두"};
		String[][] fruits = {{"Apple","사과"},{"Watermelon","수박"},{"Peach","복숭아"},{"Strawberry","딸기"},{"tangerine","귤"}};
		int idx = (int)(Math.random() * fruits.length);
		System.out.println("\"" + fruits[idx][0] + "\"의 한국어 과일 이름은?");
		String answer = sc.nextLine();
		if(answer.equals(fruits[idx][1])) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
			System.out.println("정답은 '" + fruits[idx][1] + "'입니다.");
		}
		sc.close();
	}

}
