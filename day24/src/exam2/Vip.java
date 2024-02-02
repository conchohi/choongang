package exam2;

public class Vip extends Customer{
	//10% 할인, 포인트를 5%
	private final static double RATIO = 0.05;
	private final static double DISCOUNT_RATE = 0.1;
	
	//final static double 상수 (매직넘버 방지)
	public Vip(String id, String name) {
		super(id, name, Grade.VIP, RATIO, DISCOUNT_RATE);
	}

}
