package class2;

public class StudentMainExam {

	public static void main(String[] args) {
	//#1. Student 객체 생성
		//1-1. 홍길동 객체 생성
		Student hong = new Student();
		
		hong.name = "홍길동";
		hong.age = 20;
		hong.score = 70;
		
		
		//1-2. 김자바 각체 생성
		Student kim = new Student();
		kim.name = "김자바";
		kim.age = 25;
		kim.score = 90;
		
	//#2. 출력
		//2-1 홍길동 자료 출력
		System.out.println("이름 : " + hong.name);
		System.out.println("나이 : " + hong.age);
		System.out.println("점수 : " + hong.score);
		
		System.out.println("---------------------");
		
		//2-2 김자바 자료 출력
		System.out.println("이름 : " + kim.name);
		System.out.println("나이 : " + kim.age);
		System.out.println("점수 : " + kim.score);
	}

}
