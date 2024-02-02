package exam2;

public class CustomerMain {

	public static void main(String[] args) {
		Vip vip = new Vip("123", "홍길동");
		Gold gold = new Gold("456", "김자바");
		
		vip.showInfo(500_000);
		System.out.println("----------------");
		gold.showInfo(450_000);
		
//		Customer[] customers = {
//				new Vip("123", "홍길동"),
//				new Gold("456", "김자바")
//		};
		
	}

}
