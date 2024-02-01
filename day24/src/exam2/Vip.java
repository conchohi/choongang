package exam2;

public class Vip extends Customer{
	//10% 할인, 포인트를 0.5%
	private final static double RATIO = 0.005;
	private final static double DISCOUNT_RATE = 0.1;
	
	
	public Vip(String id, String name, String grade) {
		super(id, name, grade, RATIO, DISCOUNT_RATE);
	}

}
