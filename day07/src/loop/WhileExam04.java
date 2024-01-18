package loop;

public class WhileExam04 {

	public static void main(String[] args) {
		//문8) 주사위 2개를 5번 던져 나오는 눈을 출력하시오.
		//출력 형태   
		//(눈1, 눈2)

		for(int i = 1; i <= 5; i++) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
		}
	}

}
