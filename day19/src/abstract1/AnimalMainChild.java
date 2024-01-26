package abstract1;

public class AnimalMainChild {

	public static void main(String[] args) {
//		Dog dog = new Dog();
//		Animal aniDog = new Dog(); //자식은 부모타입에 대입 가능
		
//		Animal ani = new Animal(); //컴파일 에러 -> 미완성 클래스 = 추상 클래스
//		Cat cat = new Cat("멍멍이"); //컴파일 에러 -> 미완성 클래스 = 추상 클래스
		
//		CatChild catChild = new CatChild("멍멍이");
		Animal ani = new CatChild("댕댕이");
		Cat cat = new CatChild("바둑이");
		
		//타입변환 검사는 필수
		if(ani instanceof CatChild) {
			//자식 -> 부모 -> 자식
//			CatChild ch = (CatChild)ani;
			//실행문장
			System.out.println("CatChild로 타입 변환 완료");
		}
		//타입변환 - jdk 12버전부터
		if(ani instanceof CatChild ch){
			System.out.println("CatChild로 타입 변환 완료");
		}
		
		if(cat instanceof CatChild) {
//			CatChild ch = (CatChild)cat;
			System.out.println("Cat타입을 CatChild 타입으로 변환 완료");
		}
		
//		Animal[] aniArr = {
//				new Dog(),
//				new CatChild("체리")
//		};
	}
}
