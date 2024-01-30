package exam.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain2 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("1. 학생 입력 | 2. 정보 출력");
			System.out.println("----------------------");
			System.out.print("선택 >> ");
			int option = Integer.parseInt(sc.nextLine());
			
			if(option == 1) {
				System.out.println("이름과 학과 순으로 입력 >> ");
				String name = sc.next();
				String department = sc.next();
				
				System.out.println("DB, SW, PG 성적 차례로 입력 >> ");
				int db = Integer.parseInt(sc.next());
				int sw = Integer.parseInt(sc.next());
				int pg = Integer.parseInt(sc.next());
				students.add(new Student(name, department, db, sw, pg));
				sc.nextLine();
				System.out.println();
			} else if (option == 2) {
				System.out.println("학생 입력 종료");
				break;
			} else {
				System.out.println("숫자를 잘못 입력하셨습니다.");
			}
		}
		System.out.println();
		getRank(students);
		
		System.out.println("====================================================");
		System.out.println(" 번호 | 이름 | 학과 | DB | SW | PG | 합계 | 평균 | 학점 | 석차");
		System.out.println("====================================================");
		
		for(Student s : students) {
			s.showInfo();
		}
		
		System.out.println("개인 성적을 보고 싶은 학생의 번호 입력 >> ");
		int idx = Integer.parseInt(sc.nextLine()) - 1;
		if(idx >= students.size()) {
			System.out.println("해당 번호의 학생은 없습니다.");
		} else {
			System.out.println("*** " + students.get(idx).getName() + "의 개인 성적표 ***");
			System.out.println("====================================================");
			System.out.println(" 번호 | 이름 | 학과 | DB | SW | PG | 합계 | 평균 | 학점 | 석차");
			System.out.println("====================================================");
			students.get(idx).showInfo();
		}
		sc.close();
	}
	
	public static void getRank(List<Student> students) {
		for(int i = 0; i < students.size() - 1; i++) {
			for(int j = i + 1; j < students.size(); j++) {
				if(students.get(i).getAvg() > students.get(j).getAvg()) {
					students.get(j).rankPlus();
				} else if(students.get(i).getAvg() < students.get(j).getAvg()){
					students.get(i).rankPlus();
				}
			}
		}
	}

}
