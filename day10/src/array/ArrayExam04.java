package array;

public class ArrayExam04 {

	public static void main(String[] args) {
		//#1. 방법1
		//#1-1. 배열 공간 확보
		int[] kor = new int[10];
		
		//#1-2. 배열공간에 값을 담기
		//배열.length => 배열공간의 길이, 비교)문자열의 길이 : 문자열.length()
		//kor.length => kor이 가리키는 주소의 길이를 세기
		for(int i = 0; i < kor.length; i++) {
			kor[i] = (i+1) * 10;
		}
		
		//#1-3 출력
		for(int i = 0; i < kor.length; i++) {
			System.out.println("kor[" + i + "] = " + kor[i]);
		}
	
	}
}
