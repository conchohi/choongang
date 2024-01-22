package staticmember.exam1;

public class BeverageMain {

	public static void main(String[] args) {
		Beverage coffee1 = new Beverage("커피");
		Beverage tea1 = new Beverage("녹차");
		Beverage coffee2 = new Beverage("coffee");
		Beverage coke = new Beverage("coke");
		
		coffee1.getbeverage();
		tea1.getbeverage();
		coffee2.getbeverage();
		coke.getbeverage();
		
//		System.out.println("전체 주문 : " + Beverage.totalAmount);
//		System.out.println("커피 주문 : " + Beverage.coffeeAmount);
		System.out.println("전체 주문 : " + Beverage.getTotalAmount());
		System.out.println("커피 주문 : " + Beverage.getCoffeeAmount());
	
	}

}
