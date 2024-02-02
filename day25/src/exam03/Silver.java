package exam03;

public class Silver extends Customer{
	private final static double RATIO = 0.02;
	private final static double DISCOUNT_PERCENT = 0.05;
	
	public Silver(String id, String name) {
		super(id,name,"SILVER",RATIO, DISCOUNT_PERCENT);
	}

}
