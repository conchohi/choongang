package method;

public class MethodExam05 {

	public static void main(String[] args) {
		//전자계산기
		//1. 전원 켜기 - powerOn
		//2. 계산 - plus(4,3), minus(8,3), multiple(2,5), division(5, 2)
		//3. 전원 끄기 - powerOff
		
		powerOn();

		int resultPlus = plus(4,3);
		int resultMinus = minus(8,3);
		int resultMultiple = multiple(3,5);
		double resultDivision = division(5,2);
		
		System.out.println("4 + 3 = " + resultPlus);
		System.out.println("8 - 3 = " + resultMinus);
		System.out.println("3 * 5 = " + resultMultiple);
		if(resultDivision == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
		System.out.println("5 / 2 = " + resultDivision);
		}
		powerOff();

//		Calculator calculator = new Calculator();
//		calculator.powerOn();
//		calculator.powerOn();
//		int resultPlus = calculator.plus(4,3);
//		int resultMinus = calculator.minus(8,3);
//		int resultMultiple = calculator.multiple(3,5);
//		double resultDivision = calculator.division(5,2);
//		
//		System.out.println("4 + 3 = " + resultPlus);
//		System.out.println("8 - 3 = " + resultMinus);
//		System.out.println("3 * 5 = " + resultMultiple);
//		System.out.println("5 / 2 = " + resultDivision);
//		calculator.powerOff();
//		calculator.powerOff();
	}
	public static void powerOn() {
		System.out.println("전원을 켭니다.");			

	}

	public static void powerOff() {
		System.out.println("전원을 끕니다.");		

	}
	
	public static int plus(int a, int b) {
		return a + b;
	}
	public static int minus(int a, int b) {
		return a - b;
	}
	public static int multiple(int a, int b) {
		return a * b;
	}
	public static double division(int a, int b) {
		if(b == 0) {
			return 0;
		}
		return a / (double)b;
	}


}
