package exam03;

public class Gold extends Customer{
	private final static double RATIO = 0.03;
	private final static double DISCOUNT_PERCENT = 0.07;
	
	public Gold(String id, String name) {
		super(id,name,"GOLD",RATIO, DISCOUNT_PERCENT);
	}

}
