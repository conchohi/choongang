package array3;

public class ArrayExam3_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int[] num = new int[] {10,20,30};
		
		add(a,b);
		int result = addResult(a, b);
		System.out.println(result);
		
		arrayShow1(new int[] {50,70,80});
		arrayShow2(num);
		
	}
	public static void add(int a, int b) {
		a = a + 3;
		b = b + 7;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public static int addResult(int a, int b) {
		a = a + 3;
		b = b + 7;
		return a + b;
	}
	
	public static void arrayShow1(int[] arr) {
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println("arr[" + i + "] = " + arr[i]);
		 }
	}
	
	public static void arrayShow2(int[] num) {
		 for(int i = 0; i < num.length; i++) {
			 System.out.println("num[" + i + "] = " + num[i]);
		 }
	}
	
	
}
