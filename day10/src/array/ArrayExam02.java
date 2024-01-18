package array;

import java.util.Arrays;

public class ArrayExam02 {

	public static void main(String[] args) {
		//# 방법1
//		int[] kor = new int[3];
//		kor[0] = 70;
//		kor[1] = 90;
//		kor[2] = 85;
		
	//#1. 방법2
		//#1-1. 배열을 선언
		int[] kor = new int[] {70,90,85};
		//#1-2 출력방식1
//		System.out.println("kor[0] = " + kor[0]);
//		System.out.println("kor[1] = " + kor[1]);
//		System.out.println("kor[2] = " + kor[2]);	
		
		//#1-2 출력방식2
		for(int i = 0; i < kor.length; i++) {
			System.out.println("kor[" + i + "] = " + kor[i]);
		}
		
		//#1-2 출력방식3
		System.out.println("----------");
		//import java.util.Arrays;
		//Arrays.toString(배열의 참조변수) // 확인만 필요할 때
		System.out.println(Arrays.toString(kor));//문자열로 출력
	}
}
