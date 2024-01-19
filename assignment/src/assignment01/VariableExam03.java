package assignment01;

public class VariableExam03 {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 80;
		int eng = 70;
		int math = 90;
		int sum = kor + eng + math;
		int avg = sum / 3;
		
		System.out.println("           ** " + name + "의 중간고사 성적 **");
		System.out.println("============================================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("============================================");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", name, kor, eng, math, sum, avg);
		System.out.println("============================================");
	}

}
