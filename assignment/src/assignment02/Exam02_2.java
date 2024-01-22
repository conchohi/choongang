package assignment02;

import java.util.Scanner;

public class Exam02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = {79,88,33,100,50,90};
		
		System.out.print("배열에서 찾는 값을 입력하세요 >> ");
		int target = sc.nextInt();
		sc.close();
		
		if(isExist(score,target)) {
			System.out.println("찾는 값 : " + target);
			System.out.println("배열의 요소 위치 : " + getIndex(score, target));
		} else {
		System.out.println("찾는 값이 없습니다.");
		}
	}
	
	public static boolean isExist(int[] arr, int target) {
		for(int num : arr) {
			if(num == target) {
				return true;
			}
		}
		return false;
	}
	public static int getIndex(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(target == arr[i]) {
				return i;
			}
		}
		return 0;
	}

}
