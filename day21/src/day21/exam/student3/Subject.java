package day21.exam.student3;

public class Subject {
	//#1. 필드
	private String subjectName; //과목명
	private int subjectScore; //과목점수
	
	//#2. 생성자
//	public Subject(String subjectName, int subjectScore) {
//		this.subjectName = subjectName;
//		this.subjectScore = subjectScore;
//	}
	
	//#3. 메소드
	public void subjectInfo() {
		System.out.println(subjectName + " : " + subjectScore);
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectScore() {
		return subjectScore;
	}

	public void setSubjectScore(int subjectScore) {
		this.subjectScore = subjectScore;
	}
	
	
}
