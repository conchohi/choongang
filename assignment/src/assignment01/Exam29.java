package assignment01;

import java.util.Scanner;

public class Exam29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 >> ");
		int studentNumber = sc.nextInt();
		
		int[] students = new int[studentNumber];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = i+1;
			System.out.println("----------------");
			System.out.println((i+1) + "번째 학생의 번호 : " + students[i]);
		}
		sc.close();
		
	}
	
}
