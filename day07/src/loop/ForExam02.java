package loop;

public class ForExam02 {

	public static void main(String[] args) {
		//문2) 1 ~ 100까지의 합
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ 100까지의 자연수 합 = " + sum);
	}

}
