package exam01.abstract1;

public class Tree extends Countable {
	
	public Tree(String name) {
		super(name);
	}
	
	public void ripen() {
		System.out.println(getName() + "에 열매가 잘 익었다.");
	}
	
	@Override
	public void count() {
		System.out.println(getName() + "가 " + getNumber() + "그루 있다.");
	}

}
