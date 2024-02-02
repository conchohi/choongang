package exam2;

public class Gold extends Customer{
	//10% 할인, 포인트를 0.5%
	private final static double RATIO = 0.03;
	private final static double DISCOUNT_RATE = 0.05;
	
	public Gold(String id, String name) {
		super(id, name, Grade.GOLD, RATIO, DISCOUNT_RATE);
	}

}
