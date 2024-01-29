package interfaceexam;

public interface InterfaceAnimal {
	//#1. 상수
	public static final int A = 3; //static : 객체 생성 없이 클래스명.필드명으로 바로 사용	
								   //final : 값 변경 X, 재정의 불가능
	String NAME = "홍길동"; //권장, 생략하면 컴파일로가 자동으로 public static final 붙임
	
	public abstract void cry(); //추상 메소드
	void fly(); //public abstract 컴파일러가 붙여줌
	
//	public void test() {} : 컴파일 에러 = 인터페이스 안에는 완성 메소드 올 수 없음
}
