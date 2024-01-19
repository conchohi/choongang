package assignment02;

public class Exam04_1 {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		for(int i = 0; i < 500; i++) {
			int temp = 0;
			int idx = (int)(Math.random()*lotto.length);
			
			temp = lotto[0];
			lotto[0] = lotto[idx];
			lotto[idx] = temp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
