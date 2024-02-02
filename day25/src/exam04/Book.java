package exam04;

public class Book extends Item {
	private String author;
	private String publisher;
	
	public Book(String name, int price, String author, String publisher) {
		super(name, price);
		this.author = author;
		this.publisher = publisher;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
	}

}
