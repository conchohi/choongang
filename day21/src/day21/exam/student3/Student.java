package day21.exam.student3;

import java.util.ArrayList;

public class Student {
	/*
	 	ArrayList 
	 	- 메모리공간을 동적으로 확보
	 	- 배열은 한번 공간을 확보하면 바꿀 수 없음
	*/
	//#1. 필드
	String name; //이름
	String sn; //학번
	//과목별 점수의 저장 공간을 ArrayList로
	ArrayList<Subject> subjects;
	int sum;
	double avg;
	
	//#2. 생성자
	public Student(String name, String sn) {
		this.name = name;
		this.sn = sn;
		subjects = new ArrayList<Subject>();
	}
	
	//#3. 메소드
	void addSubject(String subjectName, int subjectScore) {
		Subject newSubject = new Subject();
		newSubject.setSubjectName(subjectName);
		newSubject.setSubjectScore(subjectScore);
		subjects.add(newSubject);
	}
	
	private void calc() { //과목과 과목정보	
		//합계
		for(int i = 0; i < subjects.size(); i++) {
			sum += subjects.get(i).getSubjectScore();
		}
		
		//평균
		avg = (double)sum / subjects.size();
	}
	
	void showInfo() {
		calc(); //먼저 계산
		//계산이 끝난 후 출력
		System.out.println("*** " + name + "님의 성적 ***");
		System.out.println("학번 : " + sn);
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);		
	}
	void checkScore() {
		//*** ~님 수강과목과 점수 확인 ***
		System.out.println("*** " + name + "님 수강과목과 점수 확인 ***");
		for(Subject s : subjects) {
//			System.out.println(s.subjectName + " : " + s.subjectScore);
			s.subjectInfo();
		}
	}
	
}
