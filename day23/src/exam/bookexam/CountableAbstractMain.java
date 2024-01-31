package exam.bookexam;

public class CountableAbstractMain {

	public static void main(String[] args) {
		CountableAbstract[] counts = {
				new BirdAbstract("뻐꾸기",5),
				new BirdAbstract("독수리"),
				new BirdAbstract("참새"),
				new TreeAbstract("사과나무",4),
				new TreeAbstract("밤나무"),
				new TreeAbstract("복숭아나무",2)
		};
		
		for (CountableAbstract countable : counts) {
			countable.count();
		}

		System.out.println("-----------------");
		
		for (CountableAbstract countable : counts) {
			//fly, ripen 자식 것, 현재는 부모에 담겨있음.
			//fly : Bird
			if(countable instanceof BirdAbstract) {
				//자식 = (자식)부모;
				BirdAbstract bird = (BirdAbstract)countable; //부모를 자식으로 타입변환
											 //다운캐스팅
				bird.fly();
			//ripen : Tree
			} else if(countable instanceof TreeAbstract tree) {
				tree.ripen();
			}
		}
	}

}
