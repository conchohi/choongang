package inheritance.exam;

public class Cosmetics extends Item{
	private String brand;
	private String color;
	
	public Cosmetics(String name, int price, String brand, String color) {
		super(name, price);
		this.brand = brand;
		this.color = color;
	}

	@Override
	public void printInfo() {
		print();
		System.out.println("브랜드 : " + brand);
		System.out.println("색상 : " + color);
	}
	
}
