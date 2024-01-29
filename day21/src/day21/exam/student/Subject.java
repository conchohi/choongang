package day21.exam.student;

public class Subject {
	//#1. 필드
	String subjectName; //과목명
	int subjectScore; //과목점수
	
	//#2. 생성자
	public Subject(String subjectName, int subjectScore) {
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}
	
	//#3. 메소드
	public void subjectInfo() {
		System.out.println(subjectName + " : " + subjectScore);
	}
	
}
