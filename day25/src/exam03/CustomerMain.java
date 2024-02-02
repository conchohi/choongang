package exam03;

public class CustomerMain {

	public static void main(String[] args) {
		Customer[] customers = {
			new General("홍길동123","홍길동"),
			new Silver("김자바짱", "김자바"),
			new Gold("s2박디비s2", "박디비"),
			new Vip("zl존파이", "나파이")
		};
		
		for (Customer customer : customers) {
			customer.purchase(700_000);
			System.out.println();
		}
	}
	

}
