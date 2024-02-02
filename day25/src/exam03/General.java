package exam03;

public class General extends Customer{
	private final static double RATIO = 0.01;
	private final static double DISCOUNT_PERCENT = 0;
	
	public General(String id, String name) {
		super(id,name,"VIP",RATIO, DISCOUNT_PERCENT);
	}

}
