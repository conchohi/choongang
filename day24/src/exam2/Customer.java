package exam2;

public abstract class Customer {
	private String id; //고객 아이디
	private String name; //고객 이름
	private String grade; //등급
	private int point; //보너스 포인트
	int paymentAmount;	//결제 금액
	double ratio;		//적립 비율
	private double discountRate; //할인율
	
	public Customer(String id, String name, String grade, double ratio, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.ratio = ratio;
		this.discountRate = discountRate;
	}
	
	//#3. 포인트 계산 메소드
	private void calcPoint(int price) {
		point += (int)(price * ratio);
	}
	
	//#4. 결제 금액 계산 메소드
	private void calcPrice(int price) {
		paymentAmount += (int)(price * (1 - discountRate));
	}
	
	//#5. 결제 고객정보 보여주기 메소드
	public void showInfo(int price) {
		System.out.println(name + "님의 등급은 " + grade + "입니다.");

		calcPoint(price);
		System.out.println(name + "님의 현재 포인트 누적액은 " + point + "입니다.");
		
		calcPrice(price);
		System.out.println(name + "님의 총 결제금액은 " + paymentAmount + "입니다.");
		
		System.out.println();
	}
}
