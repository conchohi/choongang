package assignment02;

public class Exam03_1 {

	public static void main(String[] args) {
		int[] num = {0,1,2,3,4,5,6,7,8,9};

		for(int i = 0; i < 100; i++) {
			int temp = 0;
			int idx = (int)(Math.random()*num.length);
			
			temp = num[0];
			num[0] = num[idx];
			num[idx] = temp;
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
