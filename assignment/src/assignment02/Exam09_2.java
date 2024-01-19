package assignment02;

import java.util.Scanner;

public class Exam09_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] idx = {0,1,2,3,4,5,6};
		
		String[][] days = {
				{"월요일","Monday"},
				{"화요일","Tuesday"},
				{"수요일","Wednesday"},
				{"목요일","Thursday"},
				{"금요일","Friday"},
				{"토요일","Saturday"},
				{"일요일","Sunday"}
				};
		
		int count = 0;
		
		for(int i = 0; i < 100; i++) { //순서 무작위
			int num = (int)(Math.random() * days.length);
			int temp = 0;
			
			temp = idx[0];
			idx[0] = idx[num];
			idx[num] = temp;
		}
		
		for(int i : idx) {
			System.out.println(days[i][0] + "는 영어로 뭘까요?");
			System.out.print("입력 >> ");
			String userResponse = sc.nextLine();
			if(userResponse.equalsIgnoreCase(days[i][1])) {
				System.out.println("정답입니다!");
				count++;
			} else {
				System.out.println("오답입니다...");
				System.out.println("정답은 '" + days[i][1] + "'입니다.");
			}
			System.out.println();
		}//end of for
		System.out.println("총 " + count + "문제를 맞추셨습니다.");
		
		
		sc.close();
		
	}//end of main

}
