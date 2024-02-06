package objectexam;

public class CatMain {

	public static void main(String[] args) {
		Cat cat1 = new Cat("야옹이");
		Cat cat2 = new Cat("야옹이");
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		
		System.out.println(cat1 == cat2); //false
		//toString() 메소드 재정의 하지 않았을 때
		System.out.println(cat1); //주소 objectexam.Cat@626b2d4a
		System.out.println(cat2); //주소 objectexam.Cat@5e91993f
		System.out.println(cat1.equals(cat2)); //false
		
		System.out.println(name1 == name2); //false
		//toString() 메소드 재정의
		System.out.println(name1); //홍길동
		System.out.println(name2); //홍길동
		//String 클래스는 Object의 equals() 메소드 재정의
		System.out.println(name1.equals(name2)); //true
		
		Dog dog1 = new Dog("멍멍이");
		Dog dog2 = new Dog("멍멍이");
		
		System.out.println(dog1 == dog2); //false
		//toString() 메소드 재정의
		System.out.println(dog1); //멍멍이
		System.out.println(dog2); //멍멍이
		System.out.println(dog1.equals(dog2));
	}

}
