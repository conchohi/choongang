package studentexam3;

public class Student {
	//#1. 필드
	private static int count = 0;
	private String name; //이름
	private int studentId; //학번
	private int kor; //국어
	private int eng; //영어
	private int math; //수학
	
	//#2. 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		count++;
		studentId = count + 20240000;
	}
	
	//#3. 성적 계산 및 과목별 점수 출력 메소드
	public void scoreCalc() {
		System.out.println("*** " + name + "님 수강과목과 점수 확인 ***");
		System.out.println("수강과목\t점수");
		System.out.println("국어\t" + kor);
		System.out.println("영어\t" + eng);
		System.out.println("수학\t" + math);
	}
	
	//#4. 성적 출력 메소드
	public void studentInfo() {
		System.out.println("*** " + name + "님 성적 ***");
		System.out.println("학 번 : " + studentId);
		System.out.println("총 점 : " + getSum());
		System.out.printf("평 균 : %.2f\n", getAvg());
	}
	
	private int getSum() {
		return kor + eng + math;
	}
	
	private double getAvg() {
		return getSum() / 3.0;
	}
}
