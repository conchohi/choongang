package day21.exam.student;

public class StudentMain {
	
	public static void main(String[] args) {
		//#1. 객체 생성
		Student hong = new Student("홍길동", "1234");
		
		//#2. 생성된 객체의 배열에 과목과 점수 넘겨주기
		hong.subjects = new Subject[]{
				new Subject("국어", 70),
				new Subject("수학", 50),
				new Subject("과학", 90)
		};
		
		//과목의 합계와 평균 출력
		hong.showInfo();
		System.out.println("-------------------");
		
		//과목별 점수
		hong.checkScore();
		
		//#1. 객체 생성
		Student kim = new Student("김자바", "2345");
				
		//#2. 생성된 객체의 배열에 과목과 점수 넘겨주기
		kim.subjects = new Subject[]{
				new Subject("국어", 95),
				new Subject("영어", 80)
		};
				
		//과목의 합계와 평균 출력
		kim.showInfo();
		System.out.println("-------------------");
				
		//과목별 점수
		kim.checkScore();		
		
	}
}
