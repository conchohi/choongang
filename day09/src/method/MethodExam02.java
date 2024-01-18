package method;


public class MethodExam02 {

	public static void main(String[] args) {
		showPrint(3);
		showPrint(3,"즐거운 자바!!");
		System.out.println();
		
		//두 정수를 넘겨주고 곱한 결과를 되돌려 받아서 출력
		int result = multipleReturn(5, 4);//메서드명(넘겨주는 값1, 넘겨주는 값2) 메소드를 호출
		System.out.println(result);
	}//end of main
	
	// 메소드를 정의 - 위로부터 두 정수를 넘겨받아 곱셈을 한 다음 그 결과를 넘겨줌
	
	public static int multipleReturn(int num1, int num2) {
//		int multipleResult = num1 * num2;
//		return multipleResult; //결과를 리턴(=반환), 리턴값이 있을때는 생략할 수 없다.
		return num1 * num2;
	}
	
	public static void showPrint(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("Hello Java");				
		}
		return; //일반적으로 생략되어 있음
	}
	public static void showPrint(int num, String str) {
		for(int i = 0; i < num; i++) {
			System.out.println(str);				
		}
		return; //일반적으로 생략하고 씀
	}
	

}
