package bookexam;

public class Exam3_2_7 {

	public static void main(String[] args) {
		float var1 = 10f;
		float var2 = var1 / 100;
//		double var1 = 10;
//		double var2 = var1 / 100;
		if(var2 == 0.1) { //0.1은 정확히 0.1이라 말할 수 없음
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
	}

}
