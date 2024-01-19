package assignment01;

import java.util.Scanner;

public class Exam18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 >> ");
		String jumin = sc.nextLine();
		char genderCheck = jumin.charAt(7);
		String gender = "";
		if(genderCheck == '1' || genderCheck == '3') {
			gender = "남";
		} else if(genderCheck == '2' || genderCheck == '4') {
			gender = "여";
		} 
		System.out.println("당신은 " + gender + "자입니다.");
		
		sc.close();
	}

}
