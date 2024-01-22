package staticmember.exam1;

public class Beverage2 {
	//인스턴스 필드
	private String beverage;
	
	//생성자 - 음료 종류를 입력 받음
	public Beverage2(String beverage) {
		//인스턴스 필드는 this 붙임
		this.beverage = beverage;
		
		//static(=정적) 필드는 this 안붙임 : 클래스명.필드명
		CoffeeStaticCount.allCount++;
		
		boolean eq = beverage.equals("커피") || beverage.equalsIgnoreCase("coffee"); 
		if(eq) {
			CoffeeStaticCount.coffeeCount++;
		}
		
	}

	public String getbeverage() {
		return beverage;
	}
	
}
