package main1;

public class CalculatorExam {

	public static void main(String[] args) {
		//#1. 객체 생성
		Calculator cal = new Calculator();

		cal.powerOn();
		
		int result = cal.plus(5, 6);
		
		System.out.println("결과1 : " + result);
		
		cal.showInfo();
//		cal.powerOff();
	}

}
