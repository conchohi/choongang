package operator1;

public class OperatorExam6 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int a = 1;
		int b = 1;
		
		int result1 = ++x + 10; //12 
		int result2 = y++ + 10; //11
		//x = 2, y = 2
		
		int result3 = a-- + 10; //11
		int result4 = --b + 10; //10
		//a = 0, b = 0
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
	}

}
