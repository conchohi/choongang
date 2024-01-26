package inheritance.exam;

import java.text.DecimalFormat;

public abstract class Item {
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	//#3. 메소드 - private 으로 설정된 필드의 값을 읽어 외부에 전달, getter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//#4. 출력용 메소드 - 전체가 아닌 부모인 Item이 가진 필드만 출력할 수 있는 프린트 메소드
	public abstract void printInfo();
	
	public void print() {
		DecimalFormat f = new DecimalFormat("#,##0원");
		System.out.println("*****************");
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + f.format(price));
	}
	
}
