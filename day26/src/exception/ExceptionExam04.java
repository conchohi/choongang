package exception;

public class ExceptionExam04 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = {10,20};
//		String arrTest = null;
		
//		try {
//			System.out.println(a/b); //ArithmeticException
//			for(int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//				arr[i+1] =  i + 30; //ArrayIndexOutOfBoundsException
//			}
////			System.out.println(arrTest.toString());//NullPointerException
//		} catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 공간이 부족합니다");
//		} catch(NullPointerException e) {
//			System.out.println("참조되는 곳이 없습니다.");
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		} finally {
//			
//		}
		
		try {
			System.out.println(a/b); //ArithmeticException
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				arr[i+1] =  i + 30; //ArrayIndexOutOfBoundsException
			}
//			System.out.println(arrTest.toString());//NullPointerException
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생하였습니다.");
		} catch(NullPointerException e) {
			System.out.println("참조되는 곳이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
