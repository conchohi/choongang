package loop;

public class WhileExam06 {
	public static void main(String[] args) {
			//문10) 1 ~ 10까지의 홀수의 합만 구하기
			//while, continue 활용
		
			int i = 0;
			int oddSum = 0;
			
			while(i < 10) {
				i++;
				
				if(i % 2 == 0) {
					continue;
				}
				oddSum += i;
			}
			
			System.out.println("1 ~ 10까지의 홀수의 합 :" + oddSum);			
		
	}

}
