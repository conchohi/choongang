package assignment01;


public class Exam24 {

	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		while(true) {
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			if(dice1 + dice2 == 5) {
				break;
			}
			System.out.print("(" + dice1 + ", " + dice2 +") ");
		}
	}

}
