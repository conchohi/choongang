package loop;

public class ForExam06 {

	public static void main(String[] args) {
		//문5) 구구단 3단 출력 
		int num = 3;
		for(int i = 1; i <= 9; i++) {
//			System.out.println(num + " * " + i + " = " + (num * i));
			System.out.printf("%d * %d = %d\n", num, i, (num*i));
		}
	}

}
