package exam04;

public class ItemMain {

	public static void main(String[] args) {
		Item[] items = {
				new Cosmetics("립스틱", 25000, "아모레퍼시픽", "Red"),
				new Jeans("기모청바지", 35000, 77),
				new Book("JAVA", 35000, "홍길동", "H출판사")
		};
		
		Item.printItems(items);
	}

}
