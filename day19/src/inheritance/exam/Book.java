package inheritance.exam;

public class Book extends Item{
	String author;
	String publisher;

	public Book(String name, int price, String author, String publisher) {
		super(name, price);
		this.author = author;
		this.publisher = publisher;
	}

	@Override
	public void printInfo() {
		print();
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
	}
	
	

}
