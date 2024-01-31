package exam.bookexam;

public class TreeAbstract extends CountableAbstract {
	
	public TreeAbstract(String name) {
		super(name);
	}
	
	public TreeAbstract(String name, int count) {
		super(name, count);
	}
	
	
	@Override
	public void count() {
		System.out.println(name + "가 " + count + "그루 있다.");
	}
	
	public void ripen() {
		System.out.println(name + " " + count + "그루에 열매가 잘 익었다.");
	}
	

}
