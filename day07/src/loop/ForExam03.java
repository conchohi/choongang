package loop;

public class ForExam03 {

	public static void main(String[] args) {
		//문3) 100 ~ 1까지의 합 
		int sum = 0;
		
		for(int i = 100; i >= 1; i--) {
			sum += i;
		}
		
		System.out.println("100 ~ 1까지의 자연수 합 = " + sum);
	}

}
