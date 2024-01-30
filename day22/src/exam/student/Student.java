package exam.student;

import java.text.DecimalFormat;

public class Student {
	private static int count = 0;
	private int number;
	private String name;
	private String department;
	private int db;
	private int sw;
	private int pg;
	private String grade;
	private int sum;
	private double avg;
	private int rank;
	
	public Student(String name, String department, int db, int sw, int pg) {
		count++;
		number = count;
		this.name = name;
		this.department = department;
		this.db = db;
		this.sw = sw;
		this.pg = pg;
		sum = db + sw + pg;
		avg = (double)sum / 3;
		
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

	public int getRank() {
		return rank;
	}

	public void rankPlus() {
		this.rank++;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	public void showInfo() {
		DecimalFormat f = new DecimalFormat("0.#");
		System.out.printf("%3d  %4s %4s %3d  %3d  %3d  %4d  %4s %3s  %3d\n",number,name,department,db,sw,pg,sum,f.format(avg),grade,rank);
	}
	
}
