package staticmember.exam1;

public class CoffeeStaticCount {
//	int allCount = 0; //인스턴스 필드
//						//객체를 생성해야 사용 가능
//	int coffeeCount = 0; //인스턴스 필드
	static int allCount = 0;
	static int coffeeCount = 0;
	
	//생성자에 private을 붙이면 외부에서는 객체를 생성할 수 없음
	private CoffeeStaticCount() {}
	
	public int getAllCount() {
		return allCount;
	}
	public int getCoffeeCount() {
		return coffeeCount;
	}
	
	
	
}
