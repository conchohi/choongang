package loop;

public class WhileExam02 {

	public static void main(String[] args) {
		//1 ~ 100까지의 짝수의 합만 구하기
		int evenSum = 0;
		
		//#1. 짝수인지 판별해서 짝수만 합
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}
		}
		System.out.println("짝수의 합 : " + evenSum);
		
		//#2. 홀수면 계산하지 않게
		evenSum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) { //if(!(i % 2 ==0))
				continue;
			}
			evenSum += i;
		}
		System.out.println("짝수의 합 : " + evenSum);
		
		//#3. 2부터 100까지 +2씩
		evenSum = 0;
		for(int i = 2; i <= 100; i += 2) {
			evenSum += i;
		}
		System.out.println("짝수의 합 : " + evenSum);
		
	}

}
