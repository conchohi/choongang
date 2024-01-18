package operator1;

public class OperatorExam3 {

	public static void main(String[] args) {
		/* 
		 * 문2) 숫자가 756이 있습니다.
		 *     1의 자리의 값을 버리는 프로그램을 작성하시오.
		 *     즉, 결과가 750이 되게 하시오.
		 */
		int num = 756; //숫자
		int share = 0; //숫자를 10으로 나눈 몫을 담을 변수
		int result = 0;
		
		//#2. 계산 처리
		share = num / 10;
		result = share * 10;
		
		//#3. 화면 출력
		System.out.println("숫자 : " + num);
		System.out.println("숫자 / 10 : " + share);
		System.out.println("최종 결과 : " + result);
//		System.out.println("처리 후 : " + (num / 10 * 10));
//		System.out.println("처리 후: " + (num - num % 10));
		System.out.println("100의 자리 없애기 : " + (num%100));
		System.out.println("자리수 더하기 : " + (num/100 + num%100/10 + num%10));
	

	}

}
