package exam.bookexam;

public class CountableMain {

	public static void main(String[] args) {
		//자식 -> 부모
		Countable[] countables = {
				new Bird("뻐꾸기"),
				new Bird("독수리"),
				new Bird("참새"),
				new Tree("사과나무"),
				new Tree("밤나무"),
				new Tree("복숭아나무")
		};
		
		for (Countable countable : countables) {
			countable.count();
		}

		System.out.println("-----------------");
		
		for (Countable countable : countables) {
			//fly, ripen 자식 것, 현재는 부모에 담겨있음.
			//fly : Bird
			if(countable instanceof Bird) {
				//자식 = (자식)부모;
				Bird bird = (Bird)countable; //부모를 자식으로 타입변환
											 //다운캐스팅
				bird.fly();
			//ripen : Tree
			} else if(countable instanceof Tree tree) {
				tree.ripen();
			}
		}

		
	}

}
