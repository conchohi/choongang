package type;


public class TypeExam03 {

	public static void main(String[] args){
//		double avg = 35 / 3; //자동 형변환(upcasting) 11.0
//		int sum = 35.0 / 3; // 정수타입 = (실수 / 정수)-> 실수타입
							// 큰 범위의 타입을 작은 범위 타입에 담으면 에러
		int sum = (int)(35.0 / 3);//강제 형변환(downcasting)
								  //자료 손실 있음
		System.out.println(sum);
		
		int kor = 90;
		String name = "홍길동";
		String name2 = new String("홍길동");
		
		System.out.println(kor == 90); //true
		System.out.println(name == "홍길동"); //true
		System.out.println(name2 == "홍길동"); //false
		System.out.println(name2.equals("홍길동")); //false
		
	}

}