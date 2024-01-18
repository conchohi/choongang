package array2;

import java.util.Arrays;

public class Array2_4_1 {

	public static void main(String[] args) {
		//#1. 로또번호를 담을 변수 선언
		
		int[] lotto = new int[45]; //45개의 정수값을 담을 배열 공간 생성
		
		//#2. for문을 이용하여 로또 번호 담기
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		//#3. lotto 배열에 담긴 값 확인
		System.out.println("변경 전 = " + Arrays.toString(lotto));
		
		//#4. 로또 번호 섞기
		for(int i = 0; i < 100; i++) {
			int n1 = (int)(Math.random() * 45);
			int n2 = (int)(Math.random() * 45);
			int temp = 0;
			
			temp = lotto[n1];
			lotto[n1] = lotto[n2];
			lotto[n2] = temp;
		}
		//섞인 로또 번호
		System.out.println("변경 후 = " + Arrays.toString(lotto));
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}

}
