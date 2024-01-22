package staticmember.exam1;

public class BeverageMain2 {

	public static void main(String[] args) {
		Beverage2 coffee1 = new Beverage2("커피");
		Beverage2 tea1 = new Beverage2("녹차");
		Beverage2 coke = new Beverage2("콜라");
		Beverage2 coffee2 = new Beverage2("coffee");
		Beverage2 coke1 = new Beverage2("coke");
		
		coffee1.getbeverage();
		tea1.getbeverage();
		coffee2.getbeverage();
		coke.getbeverage();
		coke1.getbeverage();
		
		//확인
		//정적필드(=static 필드)
		System.out.println("전체 주문 : " + CoffeeStaticCount.allCount);
		System.out.println("커피 주문 : " + CoffeeStaticCount.coffeeCount);
	
	}

}
