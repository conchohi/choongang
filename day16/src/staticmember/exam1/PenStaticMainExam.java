package staticmember.exam1;


public class PenStaticMainExam {

	public static void main(String[] args) {
		//#1. pen 객체 생성
		PenStatic red = new PenStatic("red");
		PenStatic green = new PenStatic("green");
		PenStatic red2 = new PenStatic("RED");
		PenStatic blue = new PenStatic("blue");
		PenStatic red3 = new PenStatic("Red");
		
		red.getColor();
		red2.getColor();
		red3.getColor();
		green.getColor();
		blue.getColor();
		
//		System.out.println(red.count); //되도록 사용 X
		//static 필드 호출 : 클래스명.필드명
//		System.out.println(PenStatic.count);
		//private이 붙는 것은 외부에서 호출 안됨
		
		//static 메소드 호출 : 클래스명.메소드명()
		System.out.println(PenStatic.getCount());
		System.out.println(PenStatic.getAllCount());
		
	}

}
