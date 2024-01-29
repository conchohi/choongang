package day21.exam.student3;

public class StudentArrayListMain {

	public static void main(String[] args) {
		Student hong = new Student("홍길동","1234");
		hong.addSubject("국어", 50);
		hong.addSubject("수학", 80);
		hong.addSubject("영어", 70);
		
		hong.checkScore();
		System.out.println();
		hong.showInfo();
	}

}
