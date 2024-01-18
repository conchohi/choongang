package array;

//import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam07 {

	public static void main(String[] args) {
		//문2) 3명 학생이름과 성적을 입력받아 출력하세요.
			// 1차원 배열 이용
			// 출력형태
				//학생 이름 :
				//학생 성적 :
		int studentNumber = 3;
				
		Scanner sc = new Scanner(System.in);
		String[] names = new String[studentNumber];
		int[] scores = new int[studentNumber];
				
		//names.length == scores.length == studentNumber 
				
		//입력받기
		for(int i = 0; i < studentNumber; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요 >> ");
			names[i] = sc.nextLine();
			System.out.print((i+1) + "번째 학생의 점수를 입력하세요 >> ");
			scores[i] = Integer.parseInt(sc.nextLine());
		}
				
//		System.out.println("학생 이름 : " + Arrays.toString(names));
//		System.out.println("학생 성적 : " + Arrays.toString(scores));
		for(int i = 0; i < studentNumber; i++) {
			System.out.println("-------- "+ (i+1) + "번쨰 ---------");
			System.out.println("학생 이름 : " + names[i]);
			System.out.println("학생 점수 : " + scores[i]);

		}
		
		sc.close();
				
	}
}
