package exam.student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Student[] students;
		Scanner sc = new Scanner(System.in);
		int studentCount = 0;
		
		System.out.println("학생 수를 입력해주세요 >> ");
		studentCount = Integer.parseInt(sc.nextLine());
		students = new Student[studentCount];
		
		for(int i = 0; i < studentCount; i++) {
			System.out.println("이름과 학과 순으로 입력 >> ");
			String name = sc.nextLine();
			String department = sc.nextLine();
			
			System.out.println("DB, SW, PG 성적 차례로 입력 >> ");
			int db = Integer.parseInt(sc.nextLine());
			int sw = Integer.parseInt(sc.nextLine());
			int pg = Integer.parseInt(sc.nextLine());
			students[i] = new Student(name, department, db, sw, pg);
			System.out.println();
		}
		
		getRank(students);
		
		System.out.println("====================================================");
		System.out.println(" 번호 | 이름 | 학과 | DB | SW | PG | 합계 | 평균 | 학점 | 석차");
		System.out.println("====================================================");
		for(Student s : students) {
			s.showInfo();;
		}
		
		System.out.println("개인 성적을 보고 싶은 학생의 번호 입력 >> ");
		int idx = Integer.parseInt(sc.nextLine());
		System.out.println("*** " + students[idx-1].getName() + "의 개인 성적표 ***");
		System.out.println("====================================================");
		System.out.println(" 번호 | 이름 | 학과 | DB | SW | PG | 합계 | 평균 | 학점 | 석차");
		System.out.println("====================================================");
		students[idx-1].showInfo();
		
		sc.close();
	}
	
	public static void getRank(Student[] students) {
		for(int i = 0; i < students.length - 1; i++) {
			for(int j = i + 1; j < students.length; j++) {
				if(students[i].getAvg() > students[j].getAvg()) {
					students[j].rankPlus();
				} else if(students[i].getAvg() < students[j].getAvg()){
					students[i].rankPlus();
				}
			}
		}
	}

}
