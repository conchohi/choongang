package array2;

public class Array2_3_sh {

	public static void main(String[] args) {
		//문3) 0~9까지의 숫자를 임의로 섞어서 출력하는 프로그램 작성(shuffle)하시오.
		
		int[] num = new int[10];
		int count = 0;
		while(count < 10) {
			int shuffleNum = (int)(Math.random() * 10) + 1;
			
			for(int i = 0; i < num.length; i++) {
				if(shuffleNum == num[i]) {
					break;
				}
				
				if(i == num.length-1) {
					num[count++] = shuffleNum;
				}
			}
		}
		
		for (int i : num) {
			System.out.print(i + " ");
		}
		
	}

}
