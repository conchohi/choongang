package exam.array;

public class ArrayExam2 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 0;
		int middle = arr.length / 2;
		for(int i = 0; i < arr.length; i++) {
			if(i <= middle) {
				for(int j = i; j < arr[i].length - i; j++) {
					arr[i][j] = ++count;
				}
			} else {
				for(int j = arr[i].length - (i+1); j <= i; j++) {
					arr[i][j] = ++count;
				}
			}
		}
		
		for(int[] arrRow : arr) {
			for(int col : arrRow) {
				if(col == 0) {
					System.out.printf("%-4s", " ");
				} else {
					System.out.printf("%-4d", col);
				}
			}
			System.out.println();
		}
		
	}
}
