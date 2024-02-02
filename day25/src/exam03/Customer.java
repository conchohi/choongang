package exam03;

import java.text.DecimalFormat;

public abstract class Customer {
	private String id;
	private String name;
	private String grade;
	private int point;
	private double ratio;
	private double discountPercent;
	
	public Customer(String id, String name, String grade, double ratio, double discountPercent) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.ratio = ratio;
		this.discountPercent = discountPercent;
	}
	
	public void purchase(int price) {
		DecimalFormat f = new DecimalFormat("#,##0원");
		System.out.println("회 원 명 : " + name);
		System.out.println("회원 등급 : " + grade);
		System.out.println("물건 가격 : " + f.format(price));
		System.out.println("구입 금액 : " + f.format((int)(price * (1-discountPercent))));
		point += price * ratio;
		System.out.println("누적 포인트 : " + point + "점");
	}
	
	public String getId() { //에러 안보기 용
		return id;
	}
}
