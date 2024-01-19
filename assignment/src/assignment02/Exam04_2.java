package assignment02;

import java.util.Arrays;

public class Exam04_2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int idx = 0;
		while(idx < 6) {
			int num = (int)(Math.random() * 45) + 1; // 1 ~ 45 사이 숫자
			
			boolean exists = false; //lotto 배열에 중복된 숫자 여부 확인
			
			for(int i = 0; i < idx; i++) {
				if(lotto[i] == num) {
					exists = true;
				}
			}
			
			if(!exists) {
				lotto[idx++] = num; //배열에 존재하지 않으면 추가 
			}
		}
		
		Arrays.sort(lotto); //로또 오름차순 정렬
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		

	}

}
