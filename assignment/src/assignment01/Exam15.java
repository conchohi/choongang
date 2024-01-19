package assignment01;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 여행하고 싶은 곳을 아래에서 골라 입력하세요.");
		System.out.print("(산, 바다) >> ");
		
		String destination = sc.nextLine();
		
		String recommendation = "";
		if(destination.equals("산")) {
			recommendation = "한라산";
		} else if(destination.equals("바다")) {
			recommendation = "동해";
		}
		System.out.println("당신이 선택한 여행 희망지는 '" + destination +"'입니다.");
		System.out.println("당신에게 추천하는 곳은 '" + recommendation + "'입니다.");
		
		sc.close();
		
	}

}
