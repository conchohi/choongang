package variable2;

public class VariableExchangeExample {

	public static void main(String[] args) {
		//#1. 변수 선언
		int x = 3;
		int y = 5;
		int temp = 0;
		
		//#2. 변경전 변수에 담긴 값을 출력
		System.out.println("변경전 : x = " + x + ", y = " + y);
		
		//#3. 변수에 담긴 값을 변경
		temp = x; //x에 담긴 값을 temp 변수에 담기
		x = y; //y에 담긴 값을 x 변수에 담기
		y = temp; //temp에 담긴 값(초기 x의 값)을 y 변수에 담기
		
		//#4. 변경후 변수에 담긴 값을 출력
		System.out.println("변경후 : x = " + x + ", y = " + y);
	
		int num = 3;
		System.out.println(num);
		
		num = 7;
		System.out.println(num);
		
//		num = 3.5; //에러, num은 정수만 담을 수 있음 , 3.5는 실수이므로 담을 수 없음
		
//		double num = 3.5; //에러, 위에서 이미 선언된 (int 타입)변수는 
					//같은 이름으로 다시 다른 타입으로 선언 불가
		
	}

}
