package bookexam;

import java.text.DecimalFormat;

public class Exam3_2_10 {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		//double var4 = var1 * var1 * var2 + "." + var3;
		//에러 원인 : var4 실수형인데 오른쪽 결과는 문자열
		//문자열을 실수로 변환 : Double.parseDouble(문자열)
		double var4 = var1 * var1 * Double.parseDouble(var2+"."+var3);
		DecimalFormat dc = new DecimalFormat("#.###");
		
		System.out.println("원의 넓이 : " + dc.format(var4));
		
	
	}

}
