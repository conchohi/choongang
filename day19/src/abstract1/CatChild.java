package abstract1;

public class CatChild extends Cat{
	//#1. 필드
//	String name = "홍길동";
	//#2. 생성자
	public CatChild() {
//		super(this.name); //컴파일 에러
						  //this : 자신의 객체 -> 부모 생성 전 생성 X
		super("홍길동"); //가능
	}
	
	public CatChild(String name) {
		super(name);
	}
	
	//#3. 메소드
	@Override
	public void cry() {
		
	}
	
}
