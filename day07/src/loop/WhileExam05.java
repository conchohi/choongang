package loop;

public class WhileExam05 {

	public static void main(String[] args) {
		//문9) 주사위 2개를 던져 나온 눈의 합이 5가 되면 실행을 멈추고 
		//두 눈의 합이 5가 아니면 계속 주사위를 던져 나오는 눈을 출력하세요.
	    //	  while, break 활용
	    //	  (눈1, 눈2)
	    //	  (출력형태) (1, 4), (2, 3), (3, 2), (4, 1).... 순서는 관계 없음
		
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
