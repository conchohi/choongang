package assignment01;

public class Exam10 {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 80;
		int eng = 65;
		int math = 70;
		String result = (kor >= 60 && eng >= 60 && math >= 60) ? "통과" : "탈락";
		System.out.println(name + "의 결과는 " + result);
		
	}

}
