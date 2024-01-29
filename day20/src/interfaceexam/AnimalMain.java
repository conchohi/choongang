package interfaceexam;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal ani = new Animal("바둑이", 3); //추상 클래스
		Cat cat = new Cat("체리", 2);
		Dog dog = new Dog("강산", 5);
		
		cat.showInfo(); //부모(Animal)
		dog.showInfo(); //자식(재정의)
		
		cat.cry(); //자식(자식이 완성)
				   //부모 것은 미완성 
		dog.cry(); //자식
		
		cat.name = "야옹이";
		
		Animal[] ani = {
				new Cat("체리", 2),
				new Dog("강산", 5)
		};
//		ani[0].showInfo();
		for (int i = 0; i < ani.length; i++) {
			ani[i].showInfo();
			ani[i].cry();
			if(ani[i] instanceof Cat) { //자식 -> 부모, 부모 타입에 자식을 담아서 부모 부분을 사용할 수 있음
											//단, 재정의된 메소드 제외
				Cat c = (Cat)ani[i]; //자식 -> 부모 -> 자식
									// 자식이 숨겨진 자식 객체의 자료를 사용
				c.cry();
				c.showInfo();
			}
			
			if(ani[i] instanceof Dog d) {
				d.run();
				d.cry();
				d.showInfo();
			}
		}
		
		for(Animal animal : ani) {
			animal.showInfo();
			animal.cry();
		}
	}
}
