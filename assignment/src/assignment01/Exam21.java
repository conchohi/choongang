package assignment01;


public class Exam21 {

	public static void main(String[] args) {
		int oddSum = 0;
		int evenSum = 0;
		int multipleSum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
			if(i % 3 == 0) {
				multipleSum += i;
			}
			
		}
		System.out.println("1 ~ 100까지의 홀수의 합 = " + oddSum);
		System.out.println("1 ~ 100까지의 짝수의 합 = " + evenSum);
		System.out.println("1 ~ 100까지의 3의 배수의 합 = " + multipleSum);
	}

}
