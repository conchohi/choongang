package assignment01;

public class Exam06 {
	public static void main(String[] args) {
		int firstNum = 5;
		int secondNum = 7;
		int temp = 0;
		
		System.out.println("변경전  firstNum = " + firstNum);
		System.out.println("변경전 SecondNum = " + secondNum);
		
		System.out.println();
		temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
		System.out.println();

		System.out.println("변경후  firstNum = " + firstNum);
		System.out.println("변경후 SecondNum = " + secondNum);
	}

}
