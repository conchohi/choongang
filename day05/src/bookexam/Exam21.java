package bookexam;

public class Exam21 {

	public static void main(String[] args) {
		/*
		이름 : 김자바
		나이 : 25
		전화번호 : 010-123-4567
		 */
		
		//#1.변수 선언
		String name = "김자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("전화번호 : %s-%s-%s ", tel1, tel2, tel3);
	}

}
