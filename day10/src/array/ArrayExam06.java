package array;


public class ArrayExam06 {

	public static void main(String[] args) {
		//#1. 2차원 배열 선언
		int[][] scores = new int[2][3];
		
		//#2. 배열 공간에 담기
		scores[0][0] = 10;
		scores[0][1] = 20;
		scores[0][2] = 30;
		
		scores[1][0] = 40;
		scores[1][1] = 50;
		scores[1][2] = 60;
		
		//#3. 내용 출력
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(scores[i][j]);
			}
		}
	
	}
}
