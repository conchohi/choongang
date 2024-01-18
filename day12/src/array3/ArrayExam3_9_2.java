package array3;

import java.util.Scanner;

public class ArrayExam3_9_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] daysKor = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		String[] daysEng = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int idx = (int)(Math.random() * daysKor.length);
		System.out.println("\"" + daysKor[idx] + "\"은 영어로 뭘까요?");
		String answer = sc.nextLine();
		if(answer.equalsIgnoreCase(daysEng[idx])) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
			System.out.println("정답은 '" + daysEng[idx] + "'입니다.");
		}
		sc.close();
	}

}
