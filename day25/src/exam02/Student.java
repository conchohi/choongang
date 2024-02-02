package exam02;

public class Student {
	private static int count;
	private int number;
	private String name;
	private String department;
	private int db;
	private int sw;
	private int pg;
	private int sum;
	private double avg;
	private String grade;
	private int rank;
	
	public Student(String name, String department, int db, int sw, int pg) {
		this.number = ++count;
		this.name = name;
		this.department = department;
		this.db = db;
		this.sw = sw;
		this.pg = pg;
		sum = db + sw + pg;
		avg = (double) sum / 3;
		if(avg >= 90) {
			grade = "A";
		} else if(avg >= 80) {
			grade = "B";
		} else if(avg >= 70) {
			grade = "C";
		} else if(avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		rank = 1;
	}
	
	public void showInfo() {
		System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%d\n"
				, number, name, department, db, sw, pg, sum, avg, grade, rank);
	}
	
	public static void calcRank(Student[] students) {
		for(int i = 0; i < students.length - 1; i++) {
			for(int j = i; j < students.length; j++) {
				if(students[i].avg > students[j].avg) {
					students[j].rank++;
				} else if(students[i].avg < students[j].avg) {
					students[i].rank++;
				}
			}
		}
	}
	
	public String getName() {
		return name;
	}
	
	

}
