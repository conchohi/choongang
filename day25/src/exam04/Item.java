package exam04;

import java.text.DecimalFormat;

public abstract class Item {
	private String name;
	private int price;
	private static DecimalFormat f = new DecimalFormat("#,##0원");

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("*************");
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + f.format(price));
	}
	
	public static void printItems(Item[] items) {
		int sum = 0;
		String names = "";
		for (Item item : items) {
			item.showInfo();
			sum += item.price;
			names += item.name + " ";
		}
		System.out.println("===========================");
		System.out.println("오늘 판매 금액 : " + f.format(sum));
		System.out.println("===========================");
		System.out.println("판매 제품 이름 : " + names);
	}
}
