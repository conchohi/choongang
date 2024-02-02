package exam01.interface1;

public class Tree implements Countable {
	private String name;
	private int number;
	
	public Tree(String name) {
		this.name = name;
		this.number = (int)(Math.random()*10) + 1;
	}
	
	public void ripen() {
		System.out.println(name + "에 열매가 잘 익었다.");
	}
	@Override
	public void count() {
		System.out.println(name + "가 " + number + "그루 있다.");
	}

}
