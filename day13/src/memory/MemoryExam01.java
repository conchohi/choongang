package memory;

public class MemoryExam01 {

	public static void main(String[] args) {
		int a= 3;
		String name = new String("홍길동");
		int[] score = {10,20,30};
		
		String irum = null;
		int[] jumsu = null;
		int b = 0;
		System.out.println("a : " + a);
		System.out.println("name : " + name);
		System.out.println("score : " + score);
		System.out.println("-------------------");

		System.out.println("b : " + b);
		System.out.println("irum : " + irum);
		System.out.println("junsu : " + jumsu);
		System.out.println("-------------------");
		
		b = a;
		irum = name; //주소값
		jumsu = score; //주소값
		System.out.println("b : " + b);
		System.out.println("irum : " + irum);
		System.out.println("junsu : " + jumsu);
		System.out.println("-------------------");
		
		name = "김자바";
		System.out.println("name : " + name);//김자바
		System.out.println("irum : " + irum);//홍길동
		
		irum = "한사랑";
		System.out.println("name : " + name);//김자바
		System.out.println("irum : " + irum);//한사랑
		
	}

}
