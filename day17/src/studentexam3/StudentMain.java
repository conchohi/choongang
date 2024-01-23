package studentexam3;


public class StudentMain {

	public static void main(String[] args) {
//		Student hong = new Student("홍길동", 50, 80, 70);
//		hong.scoreCalc();
//		System.out.println("----------------------");
//		hong.studentInfo();
//		
//		System.out.println();
//		Student kim = new Student("김자바", 55, 96, 95);
//		kim.scoreCalc();
//		System.out.println("----------------------");
//		kim.studentInfo();
		
		
		Student[] std = {
				new Student("홍길동", 50, 80, 70),
				new Student("김자바", 55, 96, 95),
				new Student("이강산", 95, 100, 98)
		};
		
		//향상된 for문
		for (Student student : std) {
			student.scoreCalc();
			System.out.println("----------------------");
			student.studentInfo();
			System.out.println("----------------------");
		}
	}

}
