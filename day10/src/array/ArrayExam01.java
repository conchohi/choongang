package array;


public class ArrayExam01 {

	public static void main(String[] args) {
		//반 학생 10명 - 변수를 아주 많이 선언해야함
		
		//#1. 방법1
		int[] kor = new int[3]; //힙이라는 영역에 정수형을 담을 수 있는 공간을 3개 확보하고 
								//kor이라는 변수에 그 주소를 넘겨주기
						//힙에는 비어있는 변수나 객체를 만들 수 없다.
						//따라서 jvm은 공간을 만들고 값이 없으면 기본값으로 초기화
						//int -> 0, long -> 0l, double -> 0.0, float -> 0.0f
						//boolean -> false, 참조형 -> null로 초기화
		
//		System.out.println("kor[0] = " + kor[0]);//자동 초기화
//		System.out.println("kor[1] = " + kor[1]);//자동 초기화
//		System.out.println("kor[2] = " + kor[2]);//자동 초기화
		kor[0] = 70;
		kor[1] = 90;
		kor[2] = 85;
		for(int i = 0; i < kor.length; i++) {
			System.out.println("kor[" + i + "] = " + kor[i]);
		}
//		int index = 0;
//		for(int num : kor) {
//			System.out.println("kor["+ index++ +"] = " + num );
//		}
//		System.out.println("kor[0] = " + kor[0]);
//		System.out.println("kor[1] = " + kor[1]);
//		System.out.println("kor[2] = " + kor[2]);	
	}
}
