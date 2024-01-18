package loop;

public class ForExam01 {

	public static void main(String[] args) {
		//1 ~ 5까지 합
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) { //i++ => i = i + 1, i += 1
									//i - 지역변수
			sum = sum + i; //sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		//i는 지역변수 - 자기를 감싸고 있는 {} 안에서만 사용되고
		//{}를 벗어나면 메모리에서 제거
//		System.out.println("i = " + i + ", sum = " + sum); //에러
//		System.out.println("합 = " + sum);
		
	}

}
