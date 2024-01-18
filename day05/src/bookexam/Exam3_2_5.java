package bookexam;

public class Exam3_2_5 {

	public static void main(String[] args) {
		int var1 = 5;
		int var2 = 2;
//		double var3 = var1 / var2; //2.0
		double var3 = (double)var1 / (double)var2; //2.5
				// (타입) : 캐스트 연산자
		int var4 = (int)(var3*var2);
		
		System.out.println(var4);
		
	}

}
