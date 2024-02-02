package exam2;

public class General extends Customer{
	//10% 할인, 포인트를 0.5%
	private final static double RATIO = 0.01;
	private final static double DISCOUNT_RATE = 0;
	
	public General(String id, String name) {
		super(id, name, Grade.GENERAL, RATIO, DISCOUNT_RATE);
	}

}
	
	
