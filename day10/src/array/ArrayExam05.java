package array;

import java.util.Scanner;

public class ArrayExam05 {

	public static void main(String[] args) {
		//문1) 번호는 학생 수를 입력 받아 학생 수 만큼의 공간을 확보한 후
		//	 확보한 공간에 학생 수 + 1을 입력해서 번호를 만들어 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 >> ");
		
		int studentNum = sc.nextInt();
		int[] students = new int[studentNum];
		
		
		for(int i = 0; i < studentNum; i++) {
			students[i] = i + 1;
			System.out.println((i+1) + "번째 학생 번호 : " + students[i]);
		}
		
		sc.close();
		
		
	
	}
}
