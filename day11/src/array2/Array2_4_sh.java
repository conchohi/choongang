package array2;

import java.util.Arrays;

public class Array2_4_sh {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int count = 0;
		while(count < 6) {
			int num = (int)(Math.random()*45) + 1;
			
			boolean exists = false;
			for(int i = 0; i < lotto.length; i++) {
				if(num == lotto[i]) {
					exists = true;
					break;
				}
			}
			if(exists) {
				continue;
			}
			lotto[count++] = num;
		}
		
		Arrays.sort(lotto);
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
	}

}
