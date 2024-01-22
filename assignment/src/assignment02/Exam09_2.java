package assignment02;

import java.util.Scanner;

public class Exam09_2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		String[][] days = {
				{"월요일","Monday"},
				{"화요일","Tuesday"},
				{"수요일","Wednesday"},
				{"목요일","Thursday"},
				{"금요일","Friday"},
				{"토요일","Saturday"},
				{"일요일","Sunday"}
				};
		
		int count = startRandomQuiz(days);
		
		
		System.out.println("총 " + count + "문제를 맞추셨습니다.");
		
		
		sc.close();
		
	}//end of main
	
	public static void shuffleArray(String[][] arr) {
		for(int i = 0; i < 100; i++) { //순서 무작위
			int num = (int)(Math.random() * arr.length);
			String[] temp = null;
			
			temp = arr[0];
			arr[0] = arr[num];
			arr[num] = temp;
		}
	}
	
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
	
	public static int startRandomQuiz(String[][] arr) {
		shuffleArray(arr);
		return startQuiz(arr);
	}
}
