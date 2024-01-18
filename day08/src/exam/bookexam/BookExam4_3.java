package exam.bookexam;

public class BookExam4_3 {

	public static void main(String[] args) {
		//주사위 2번 던지기
		//(int)(Math.random()*6) + 1
		while(true) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			if(dice1 + dice2 == 5) {
				break;
			}
			System.out.print("(" + dice1 + ", " + dice2 + ") ");			
		}
		
	}

}
