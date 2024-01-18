package loop;

public class ForExam07 {

	public static void main(String[] args) {
		//문6) 구구단 2 ~ 4단 출력 
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 4; j++) {
				System.out.printf("%d * %d = %2d  ",j, i, (j*i));
			}
			System.out.println();
		}
	}

}
