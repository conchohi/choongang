package polymorphism.car;

public class KumhoTire extends Tire {
	
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation); //부모 Tire 객체를 호출, 매개값을 가져감.
	}
	
	//메소드
	@Override //재정의 - 부모를 고쳐씀
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "금호타이어 수명 : " + 
		(maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "금호타이어 펑크 ***");
			return false;
		}
	}
}
