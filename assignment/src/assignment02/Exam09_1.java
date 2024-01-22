package assignment02;

import java.util.Scanner;

public class Exam09_1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[][] fruits = {
				{"사과","Apple"},
				{"수박","Watermelon"},
				{"복숭아","Peach"},
				{"딸기","Strawberry"},
				{"귤","Tangerine"}
				};
		int count = startQuiz(fruits);
		
		System.out.println("총 " + count + "문제를 맞추셨습니다.");
		
		
		sc.close();
		
	}//end of main
	
	public static int startQuiz(String[][] arr) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + "는 영어로 뭘까요?");
			System.out.print("입력 >> ");
			String userResponse = sc.nextLine();
			if(userResponse.equalsIgnoreCase(arr[i][1])) {
				System.out.println("정답입니다!");
				count++;
			} else {
				System.out.println("오답입니다...");
				System.out.println("정답은 '" + arr[i][1] + "'입니다.");
			}
			System.out.println();
		}//end of for
		return count;
		
	}

}
