package inheritance.exam;

public class Jeans extends Item{
	private int size;
	public Jeans(String name, int price, int size) {
		super(name, price);
		this.size = size;
	}
	@Override
	public void printInfo() {
		print();
		System.out.println("사이즈 : " + size);
	}

}
