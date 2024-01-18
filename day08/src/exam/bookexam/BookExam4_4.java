package exam.bookexam;

public class BookExam4_4 {

	public static void main(String[] args) {
		//4x + 5y = 60
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				int result = 4 * x + 5 * y;
				if(result == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}

		}
	}

}
