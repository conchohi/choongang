package inheritance.exam;

import java.text.DecimalFormat;

public class webShopMain {

	public static void main(String[] args) {
		int sum = 0;  //당일 판매 금액 총액
	    String nameTotal =""; // 당일 판매 상품 이름
	    DecimalFormat f = new DecimalFormat("#,##0원");
	    
		Cosmetics cos = new Cosmetics("립스틱", 25000, "아모레퍼시픽", "Red");
		Jeans jean = new Jeans("기모청바지", 35000, 77);
	    Book book = new Book("JAVA", 35000, "홍길동", "중앙정보");
	      
	    Item[] items = {cos, jean, book};
	    
	    for(Item item : items) {
	    	item.printInfo();
	    	sum += item.getPrice();
	    	nameTotal += item.getName() + " ";
	    }
	    nameTotal = nameTotal.trim().replace(" ", ",");
	    
	    System.out.println("*****************");
	    System.out.println("오늘 전체 판매 금액 : " + f.format(sum));
	    System.out.println("판매 제품 이름 : " + nameTotal);
	}

}
