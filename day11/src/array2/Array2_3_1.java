package array2;

import java.util.Arrays;

//import java.util.HashSet;

public class Array2_3_1 {

	public static void main(String[] args) {
		//문3) 0~9까지의 숫자를 임의로 섞어서 출력하는 프로그램 작성(shuffle)하시오.
//		
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//변경전 배열 요소 값 출력
		System.out.println("변경 전 : " + Arrays.toString(num));
		//배열 값 섞기
		for(int i = 0; i < 100; i++) {
			//임의로 변경되는 0 ~ 9 사이의 인덱스 번호 만들기
			int n = (int)(Math.random() * 10); //임의의 인덱스)
			int temp = 0;

			
			//0번째 요소의 값과 n번째 값 바꾸기
			temp = num[0];			
			num[0] = num[n];			
			num[n] = temp;			
			
			for(int j = 0; j < num.length; j++) {
				System.out.print(num[j] + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("변경 후 : " + Arrays.toString(num));
		
		
		
		
//		HashSet<Integer> set = new HashSet<>();
//		while(set.size() < 10) {
//			int n = (int)(Math.random() * 10);
//			if(set.contains(n)) {
//				continue;
//			}
//			System.out.print(num[n] + " ");
//			set.add(n);
//		}
		
	}

}
