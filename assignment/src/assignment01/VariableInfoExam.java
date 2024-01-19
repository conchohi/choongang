package assignment01;

public class VariableInfoExam {

	public static void main(String[] args) {
		String name = "김자바";
		int excel = 76;
		int java = 98;
		int python = 50;
		int sum = excel + java + python;
		double avg = sum / 3.0;
		
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t엑셀\t자바\t파이썬\t총점\t평균");
		System.out.println("---------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", name, excel, java, python, sum, avg);
		System.out.println("---------------------------------------------------");
	}

}
