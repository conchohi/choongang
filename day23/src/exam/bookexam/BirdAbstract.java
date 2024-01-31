package exam.bookexam;

public class BirdAbstract extends CountableAbstract {
	
	public BirdAbstract(String name) {
		super(name);
	}
	public BirdAbstract(String name, int count) {
		super(name, count);
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 " + count + "마리 있다.");
	}
	
	public void fly() {
		System.out.println(count + "마리 " + name + "가 날아간다.");
	}
	
}
