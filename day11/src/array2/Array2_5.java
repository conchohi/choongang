package array2;

public class Array2_5 {

	public static void main(String[] args) {
		int count = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
//				System.out.printf("%3d", (i*5) + j);
				System.out.printf("%3d", count++);
			}
			System.out.println();
		}
		
	}

}
