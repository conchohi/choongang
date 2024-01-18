package array3;

public class ArrayExam3_5_1 {
	public static void main(String[] args) {
		int num = 5;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.printf("%4d", (i*num) + (j+1));				
			}//end of for
			System.out.println();
		}//end of for
	}//end of main

}//end of class
