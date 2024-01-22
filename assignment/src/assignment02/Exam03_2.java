package assignment02;

import java.util.Random;

public class Exam03_2 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};

		swapArray(num);
		printArray(num);
	}
	
	public static void swapArray(int[] arr) {
		Random r = new Random();
		for(int i = 0; i < 100; i++) {
			int temp = 0;
			int idx = r.nextInt(arr.length);
			
			temp = arr[0];
			arr[0] = arr[idx];
			arr[idx] = temp;
		}
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
