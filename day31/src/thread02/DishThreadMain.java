package thread02;

public class DishThreadMain {

	public static void main(String[] args) {
		Dish dish = new Dish();
		
		new Thread(new Cook(dish)).start();
		new Thread(new Customer(dish)).start();
	}

}
