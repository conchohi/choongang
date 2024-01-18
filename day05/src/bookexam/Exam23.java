package bookexam;

import java.util.Scanner;

public class Exam23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int idNum = 0;
		String tel = "";
		System.out.println("[필수 정보 입력]");
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("주민번호 앞 6자리 : ");
		idNum = sc.nextInt();
		sc.nextLine();
		System.out.print("전화번호 : ");
		tel = sc.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(idNum);
		System.out.println(tel);
		sc.close();
		
	}

}
