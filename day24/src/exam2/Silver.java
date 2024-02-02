package exam2;

public class Silver extends Customer{
	//10% 할인, 포인트를 0.5%
	private final static double RATIO = 0.02;
	private final static double DISCOUNT_RATE = 0.1;
	
	public Silver(String id, String name) {
		super(id, name, Grade.SILVER, RATIO, DISCOUNT_RATE);
	}

}
