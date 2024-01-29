package day21.exam.student2;

public class StudentMain {
	public static void main(String[] args) {
		Student hong = new Student("홍길동", "1234", 2);
		hong.addSubject("국어", 70);
		hong.addSubject("수학", 50);
		
		hong.checkScore();
		System.out.println();
		hong.showInfo();
		
		
	}

}
