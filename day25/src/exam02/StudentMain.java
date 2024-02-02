package exam02;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 >> ");
		int studentNumber = Integer.parseInt(sc.nextLine());
		
		Student[] students = new Student[studentNumber];
		
		for(int i = 0; i < studentNumber; i++) {
			System.out.println("이름과 학과 순서대로 입력 >> ");
			String name = sc.nextLine();
			String department = sc.nextLine();
			System.out.println();
			System.out.println("DB, SW, PG 순으로 성적 입력 >> ");
			int db = Integer.parseInt(sc.nextLine());
			int sw = Integer.parseInt(sc.nextLine());
			int pg = Integer.parseInt(sc.nextLine());
			
			students[i] = new Student(name, department, db, sw, pg);
			System.out.println();
		}
		
		Student.calcRank(students);

		System.out.println("===============================================================================");
		System.out.println("번호\t이름\t학과\tDB\tSW\tPG\t합계\t평균\t학점\t석차");
		System.out.println("===============================================================================");
		for (Student student : students) {
			student.showInfo();
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.print("# 개인 성적을 보고 싶은 학생의 번호 입력 >> ");
		int pick = Integer.parseInt(sc.nextLine());
		System.out.println("*** " + students[pick-1].getName() + "님의 개인 성적표 ***");
		System.out.println("===============================================================================");
		System.out.println("번호\t이름\t학과\tDB\tSW\tPG\t합계\t평균\t학점\t석차");
		System.out.println("===============================================================================");
		students[pick-1].showInfo();
		
		sc.close();
	}

}
