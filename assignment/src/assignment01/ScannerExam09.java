package assignment01;


public class ScannerExam09 {
	public static void main(String[] args) {
		
		int apple = 50;
		int pear = 35;
		int temp = 0;
		
		System.out.println("수정전 주문 개수");
		System.out.println("사과 : " + apple + ", 배 : " + pear);
		System.out.println();
		
		temp = apple;
		apple = pear;
		pear = temp;
		
		System.out.println("수정한 주문 개수");
		System.out.println("사과 : " + apple + ", 배 : " + pear);
	}

}
