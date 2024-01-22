package assignment02;

public class Exam03_1 {

	public static void main(String[] args) {
		int[] num = {0,1,2,3,4,5,6,7,8,9};

		swapArray(num);
		printArray(num);
	}
	
	public static void swapArray(int[] arr) {
		for(int i = 0; i < 100; i++) {
			int temp = 0;
			int idx = (int)(Math.random()*arr.length);
			
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
