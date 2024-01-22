package staticmember.exam1;

public class Beverage {
	//인스턴스 필드
	private String beverage;
	
	//static 필드 (= 정적 필드)
//	static int totalAmount; //전체 음료 판매 건수
//	static int coffeeAmount; //커피 주문 건수
	
	//static 필드 (= 정적 필드), private이 붙어 있어서 이 클래스 내에서만 호출 가능
	//외부 클래스에서는 사용할 수 없음
	private static int totalAmount; //전체 음료 판매 건수
	private static int coffeeAmount; //커피 주문 건수
	
	//생성자 - 음료 종류를 입력 받음
	public Beverage(String beverage) {
		//인스턴스 필드는 this 붙임
		this.beverage = beverage;
		
		//static(=정적) 필드는 this 안붙임
		totalAmount++;
		
		boolean eq = beverage.equals("커피") || beverage.equalsIgnoreCase("coffee"); 
		if(eq) {
			coffeeAmount++;
		}
		
	}

	public static int getCoffeeAmount() {
		return coffeeAmount;
	}
	public static int getTotalAmount() {
		return totalAmount;
	}

	public String getbeverage() {
		return beverage;
	}
	
}
