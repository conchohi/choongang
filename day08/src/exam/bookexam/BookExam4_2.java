package exam.bookexam;

public class BookExam4_2 {

	public static void main(String[] args) {
		// 1 ~ 100까지 3의 배수 총합 : 숫자 % 3 == 0
		//#1. 변수 선언
		int sum = 0;
		
		//#2. 처리
		for(int i = 1; i <= 100; i++) {
			
			//#2-1. i가 3의 배수일 때 처리
			if(i % 3 == 0) {
				sum += i;
			}
			
			//#2-2. i가 3의 배수가 아닐 땐 계산을 건너뛰기
			if(!(i % 3 == 0)) {
				continue;
			}
			sum += i;
		}
		System.out.println("3의 배수 총합" + sum);
		
	}

}
