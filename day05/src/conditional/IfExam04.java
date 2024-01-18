package conditional;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class IfExam04 {

	public static void main(String[] args) {
		/*
		문4) 숫자를 입력받아서 짝수인지 홀수인지 판별하는 프로그램 작성
		
		<출력형태>
		당신이 입력한 값은 5로, 홀수입니다.
		또는
		당신이 입력한 값은 8로, 짝수입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		String result = "";
		
		if(num % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println("당신이 입력한 값은 " + num + "로, " + result + "입니다.");
		
//		int number = 45780; // 45,780
//		double dNum = 3587.25; // 3,587.25
		
//		
//		
//		DecimalFormat f = new DecimalFormat("#,##0원"); //패턴 정리
//		DecimalFormat f1 = new DecimalFormat("#,##0.00"); //패턴 정리
//		System.out.println(f.format(number));
//		System.out.println(f1.format(dNum));
		sc.close();
	}

}
