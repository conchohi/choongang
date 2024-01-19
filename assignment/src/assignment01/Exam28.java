package assignment01;

import java.util.Scanner;

public class Exam28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int computer = (int)(Math.random() * 100) + 1;
		int user = 0;
		int count = 0;
		do {
			count++;
			System.out.print("숫자를 입력해주세요 >> ");
			user = sc.nextInt();
			
			if(user > computer) {
				System.out.println(user + "보다 작습니다.");
			} else if(user < computer) {
				System.out.println(user + "보다 큽니다.");
			} else {
				System.out.println(count + "번만에 맞췄습니다.");
				break;
			}
			
		} while(true);
		sc.close();
	}
	
}
