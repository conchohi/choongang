package staticmember.exam1;

public class PenStatic {
	//#1. 필드
	private String color;
	//static - 공통으로 사용하는 것에 붙임
	//		   클래스영역(데이터영역,메소드영역)의 클래스 안에 생성
	//		   메소드 영역은 클래스가 메모리에 올라갈 때 (로드)
	//		   메모리에 함께 선언됨, 그래서 어디서나 가져다 쓸 수 있음
	//		외부에서 사용할 때 : 클래스명.필드명, 클래스명.메소드명
//	static int count = 0; //static 필드
//	static int allCount = 0; //static 필드
	private static int count = 0; //static 필드
	private static int allCount = 0; //static 필드
	
	//#2. 생성자
	public PenStatic(String color) {
		this.color = color;
		
		//#2-1. 색상이 red인 것만 누적하기
		if(color.equalsIgnoreCase("red")){
			count++;
		}
		
		//#2-2. 객체 생성시 마다 누적하기
		allCount++;
	}//생성자의 끝

//	public int getCount() { //인스턴스 필드
							//인스턴스 메소드에서는 static 필드 호출 사용 가능
							//그러나 static이 붙은 메소드에서는 
							//인스턴스 필드 호출할 수 없음
//		return count;
//	}
	
//	//전체 pen 개수
//	public int getAllCount() { //인스턴스 메소드
//		return allCount;
//	}
	public static int getCount() {
		return count;
	}

	public static int getAllCount() {
		return allCount;
	}

	public String getColor() {
		return color;
	}
	
	
}
