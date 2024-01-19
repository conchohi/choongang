package accessmodifier;

public class StudentMainExam1 {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.name = "홍길동";
		student.age = 20;
		student.score = 70;
		
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.score);
		System.out.println();
		
		student.age = 150;
		student.score = 1000;
	}

}
