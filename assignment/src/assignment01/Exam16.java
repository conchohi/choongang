package assignment01;


public class Exam16 {

	public static void main(String[] args) {
		int point = 5;
		String grade = "";
		if(point >= 20) {
			grade = "VIP";
		} else if(point >= 10) {
			grade = "GOLD";
		} else {
			grade = "일반회원";
		}
		
		System.out.println("당신의 포인트는 " + point + "점으로 등급은 " + grade + "입니다");
	}

}
