package main1;

//설계도, 틀
public class Calculator {
	//#1. 필드 (= 인스턴스 변수, 멤버변수)
	int num;
	
	//#2. 생성자 (객체 초기화, 생략가능)
	
	
	//#3. 메소드 - 인스턴스 메소드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public int plus(int x, int y) {
		return x + y;
	}
	
	public double divide(int x, int y) {
		return (double)x / (double)y;
	}
	
	public void powerOff() {
		num = 30;
		System.out.println(this.num + "입니다");
		System.out.println("전원을 끕니다.");
	}
	
	public void showInfo() {
		int testResult = plus(10,20) + 30;
		System.out.println(testResult);
		
		System.out.println(divide(5, 7));
	}
}
