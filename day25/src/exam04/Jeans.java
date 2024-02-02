package exam04;

public class Jeans extends Item {
	private int size;
	
	public Jeans(String name, int price, int size) {
		super(name, price);
		this.size = size;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("사이즈 : " + size);
	}

}
