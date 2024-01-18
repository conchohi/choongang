package array3;

public class ArrayExam3_5_2 {
	public static void main(String[] args) {
//		int num = 5;
		int[][] num = new int[5][5];
		int k = 1;
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				num[i][j] = k++;
				System.out.printf("%4d", num[i][j]);				
			}//end of for
			System.out.println();
		}//end of for
	}//end of main

}//end of class