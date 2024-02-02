package exam03;

public class Vip extends Customer{
	private final static double RATIO = 0.05;
	private final static double DISCOUNT_PERCENT = 0.1;
	
	public Vip(String id, String name) {
		super(id,name,"VIP",RATIO, DISCOUNT_PERCENT);
	}

}
