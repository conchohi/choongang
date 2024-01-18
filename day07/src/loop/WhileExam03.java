package loop;

public class WhileExam03 {

	public static void main(String[] args) {
		//1 ~ 100까지의 정수들의 합이 350이상이 되면 반복문을 멈추고 
		//결과를 출력하라
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum += i;
			
			if(sum >= 350) {
				break;
			}
			i++;
		}
		System.out.println("sum = " + sum);
	}

}
