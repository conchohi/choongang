package studentexam3_1;

import java.util.ArrayList;

public class Student {
	private ArrayList<Subject> subjects = new ArrayList<>();
	private static int studentCount;
	private String name;
	private int studentId;
	private int sum;
	private double avg;
	
	public Student(String name) {
		this.name = name;
		studentCount++;
		studentId = 20240000 + studentCount;
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
		sum += subject.getScore();
		avg = (double)sum / subjects.size();
	}
	
	public void addSubject(ArrayList<Subject> subjects) {
		for (Subject subject : subjects) {
			this.subjects.add(subject);
			sum += subject.getScore();
		}
		avg = (double)sum / this.subjects.size();			
	}
	
	
	public void printSubject() {
		System.out.println("*** " + name + "님 수강과목과 점수 확인 ***");
		System.out.println("수강과목\t점수");
		for (Subject subject : subjects) {
			System.out.println(subject.getSubjectName() + "\t" + subject.getScore());
		}
	}
	
	
	public void printScore() {
		System.out.println("*** " + name + "님 성적 ***");
		System.out.println("학 번 : " + studentId);
		System.out.println("총 점 : " + sum);
		System.out.println("평 균 : " + avg);
	}
	
	
}
