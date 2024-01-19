package assignment02;

public class Exam02_1 {

	public static void main(String[] args) {
		int[] score = {79,88,33,100,50,90};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int n : score) {
			if(n > max) {
				max = n;
			}
			if(n < min) {
				min = n;
			}
		}
		
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
