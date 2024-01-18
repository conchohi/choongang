package bookexam;

public class Exam3_2_6 {

	public static void main(String[] args) {
		int value = 356;
//		int result = 356 / 100;
//		result = result * 100;
		System.out.println(value / 100 * 100);

		int result = value / 100 + value % 100 / 10 + value % 10;
		
		System.out.println(result);
		
	}

}
