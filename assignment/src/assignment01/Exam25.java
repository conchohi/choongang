package assignment01;


public class Exam25 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i < 10) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1 ~ 10까지의 홀수의 합 : " + sum);
	}

}
