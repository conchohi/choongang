package assignment01;

import java.util.Scanner;

public class Exam30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentNumber = 3;
		String[] students = new String[studentNumber];
		int[] scores = new int[studentNumber];
		
		for(int i = 0; i < students.length; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요 >> ");
			students[i] = sc.nextLine();
			System.out.print((i+1) + "번째 학생의 성적을 입력하세요 >> ");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("--------------------");
			System.out.println("학생 이름 : " +students[i]);
			System.out.println("학생 이름 : " +scores[i]);
		}
		sc.close();
	}
	
}
