package assignment02;

public class Exam02_1 {

	public static void main(String[] args) {
		int[] score = {79,88,33,100,50,90};
		
		int max = getMax(score);
		int min = getMin(score);
		
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
	
	public static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int n : arr) {
			if(max < n) {
				max = n;
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for(int n : arr) {
			if(min > n) {
				min = n;
			}
		}
		return min;
	}

}
