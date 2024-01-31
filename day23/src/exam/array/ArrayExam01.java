package exam.array;

public class ArrayExam01 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 0;
		//값을 배열 누적
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr[i].length; j++) {
				arr[i][j] = ++count;
			}
		}
		//출력
		for(int[] arrRow : arr) {
			for(int col : arrRow) {
				if(col == 0) {
					System.out.printf("%4s", " ");
				} else {
					System.out.printf("%4s", col);
				}
			}
			System.out.println();
		}
		
	}

}
