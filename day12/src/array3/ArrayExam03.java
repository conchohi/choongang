package array3;

public class ArrayExam03 {

	public static void main(String[] args) {
//		int[] name = new int[3];
		//배열 선언
//		int[][] num = new int[2][3];
//					  new 타입[행의 길이][열의 길이]; (열의 길이는 생략 가능)
		//배열에 값을 저장
//		num[0][0] = 5;
//		num[0][1] = 10;
//		num[0][2] = 20;
//		num[1][0] = 25;
//		num[1][1] = 30;
//		num[1][2] = 35;
		
		//배열 선언
		int[][] num = new int[2][]; //행의 길이는 생략 불가
		num[0] = new int[3];
		num[1] = new int[3]; //열의 개수는 행마다 다를 수 있음, num[1] = new int[5];
		
		//배열에 값을 저장
		num[0][0] = 5;
		num[0][1] = 10;
		num[0][2] = 20;
		num[1][0] = 25;
		num[1][1] = 30;
		num[1][2] = 35;
		
		//배열의 내용 출력
		for(int r = 0; r < num.length; r++) {
			for(int c = 0; c < num[r].length; c++) {
				System.out.print(num[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------");
		System.out.println();
		
		//int[] score = new int[]{10,20,30};
		int[][] scores = new int[][] {
			{10,20,30},
			{40,50,60}
			}; 
		
		for(int r = 0; r < scores.length; r++) {
			for(int c = 0; c < scores[r].length; c++) {
				System.out.printf("scores[%d][%d] = %d\n", r,c,scores[r][c]);
			}
		}
		
		int[][] scores2 = {{10,20,30},{40,50,60}};
		
		
		for(int r = 0; r < scores2.length; r++) {
			for(int c = 0; c < scores2[r].length; c++) {
				System.out.printf("scores2[%d][%d] = %d\n", r,c,scores2[r][c]);
			}
		}
	}

}
