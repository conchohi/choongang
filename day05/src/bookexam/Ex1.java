package bookexam;

public class Ex1 {
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		int c = 3;
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		System.out.println(a==c); //true
		
		
		
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		System.out.println(name1 == name2); //false
		System.out.println(name1.equals(name2)); //true
		System.out.println(name1.equalsIgnoreCase(name2)); //true
	}
}
