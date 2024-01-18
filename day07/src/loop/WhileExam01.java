package loop;

public class WhileExam01 {

	public static void main(String[] args) {
		//1 ~ 5까지의 자연수의 합
		
//		int i = 1;
//		int sum = 0;
//		
//		while(i <= 5) {
//			sum += i;
//			i++;
//		}
//		System.out.println("sum : " + sum);
		
		int i = 0;
		int sum = 0;
		
		while(i < 5) {
			i++;
			sum += i;
			System.out.println("합 : " + sum);
		}
	}

}
