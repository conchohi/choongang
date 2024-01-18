package array2;

import java.util.Arrays;

public class Array2_2_1 {

	public static void main(String[] args) {
		//문2) 다음 자료의 최댓값과 최솟값을 구하는 프로그램을 작성하시오.
			//	점수(score01) { 79, 88, 33, 100, 50, 90 }
		//#1. 변수 선언
		int[] score01 = {79,88,33,100,50,90};
		int max = score01[0]; //배열의 0번째 인덱스 값, 가장 큰 값을 담을 변수
		//max = Integer.MIN_VALUE; //정수 타입의 최소값
		int min = score01[0]; //배열의 0번째 인덱스 값, 가장 작은 값을 담을 변수
			//min = Integer.MAX_VALUE; //정수 타입의 최대값
		
		//#2. 최대, 최소값 구하기
		for(int i = 1; i < score01.length; i++) {
			if(max < score01[i]) { //max 변수에 담긴 값이 배열의 i번째 요소 값보다 작으면
				max = score01[i]; //max 변수에 i번째 요소의 값을 담음
			} //end of if
			
			if(min > score01[i]) { //min 변수에 담긴 값이 배열의 i번째 요소 값보다 크면
				min = score01[i]; //min 변수에 i번째 요소의 값을 담음
			} //end of if
		} //end of for
//		Arrays.sort(score01);
//		System.out.println("최댓값 : " + score01[score01.length-1]);
//		System.out.println("최솟값 : " + score01[0]);
		
		System.out.println(Arrays.toString(score01));
		System.out.println("최댓값 : " + max);
		System.out.println("최소값 : " + min);
//		System.out.println("최댓값 : " + max(score01));
//		System.out.println("최소값 : " + min(score01));
		
	} //end of main
	
	public static int max(int[] arr) {
		int max = arr[0];
		for(int x : arr) {
			if(x > max) {
				max = x;
			}
		}
		return max;
	}
	public static int min(int[] arr) {
		int min = arr[0];
		for(int x : arr) {
			if(x < min) {
				min = x;
			}
		}
		return min;
	}

}
