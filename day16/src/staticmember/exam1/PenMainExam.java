package staticmember.exam1;

public class PenMainExam {

	public static void main(String[] args) {
		//#1. pen 객체 생성
//		Pen red = new Pen("red");
//		Pen green = new Pen("green");
//		Pen red2 = new Pen("RED");
//		Pen blue = new Pen("blue");
		Pen red3 = new Pen("Red");
		
		int countResult = red3.getCount();
		System.out.println(countResult);
		System.out.println(red3.getAllCount());
	}

}
