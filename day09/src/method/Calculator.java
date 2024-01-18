package method;

public class Calculator {
	private boolean power = false;
	
	public void powerOn() {
		if(!power) {
			power = true;
			System.out.println("전원을 켭니다.");			
		} else {
			System.out.println("계산기가 켜져있습니다.");
		}
	}

	public void powerOff() {
		if(power) {
			power = false;
			System.out.println("전원을 끕니다.");		
		} else {
			System.out.println("계산기가 꺼져있습니다.");
		}
	}
	
	public int plus(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return a - b;
	}
	public int multiple(int a, int b) {
		return a * b;
	}
	public double division(int a, int b) {
		return a / (double)b;
	}
}
