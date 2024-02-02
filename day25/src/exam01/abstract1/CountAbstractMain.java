package exam01.abstract1;

public class CountAbstractMain {

	public static void main(String[] args) {
		Countable[] counts = {
				new Bird("뻐꾸기"),
				new Bird("독수리"),
				new Tree("사과나무"),
				new Tree("밤나무")
		};
		
		for (Countable countable : counts) {
			countable.count();
		}
		
		System.out.println();
		
		for (Countable countable : counts) {
			if(countable instanceof Bird bird) {
				bird.fly();
			} else if(countable instanceof Tree tree) {
				tree.ripen();
			}
		}
	}

}
