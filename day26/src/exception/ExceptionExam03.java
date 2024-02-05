package exception;

public class ExceptionExam03 {

	public static void main(String[] args) {
		int[] arr = {10,20};
		
		try {
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				arr[i+1] =  i + 30; //java.lang.ArrayIndexOutOfBoundsException
			}
		} catch (Exception e) {
			System.out.println(e.getMessage()); //Index 2 out of bounds for length 2
		} finally { //예외와 상관없이 반드시 실행
			System.out.println("배열에서 발생할 수 있는 예외 연습");
		}
		
		System.out.println("즐거운 시간~~");
	}

}
