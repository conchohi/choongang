package variable2;

public class VariableScoreFormat {

	public static void main(String[] args) {
		//#1. 변수 선언
			//타입 변수명 = 초기값;
		String name = "홍길동"; //이름
		int kor = 83; //국어점수
		int eng = 70; //영어점수
		int mat = 92; //수학점수
		int sum = kor + eng + mat; //세 과목의 합계
		double avg = (kor + eng + mat) / 3.0; //세 과목의 평균 
		//double avg = (double)sum / 3; //세 과목의 평균 (강제 형변환)
		//java에서 정수 / 정수 => 결과가 정수
		//		  정수 / 실수 => 결과가 실수
		//		  실수 / 정수 => 실수
		//		  실수 / 실수 => 실수
		//#2. 출력
		System.out.println("** " + name + "의 중간고사 성적 **");
		System.out.println("-------------------------------------------");
		// 				 ("출력서식", 					  출력할 값)
		System.out.printf("%5s %4s %4s %4s %5s %5s\n","이름","국어","영어","수학","합계","평균"); 
		//글씨가 오른쪽에 붙음, -붙이면 왼쪽에 붙음
		System.out.println("-------------------------------------------");
		System.out.printf("%5s %4d %4d %4d %5d %5.2f\n", name, kor, eng, mat, sum, avg);
		System.out.println("-------------------------------------------");
		System.out.println(); //한 줄 띄우기
		
		System.out.println("** " + name + "의 중간고사 성적 **");
		System.out.println("-------------------------------------------");
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t\n","이름","국어","영어","수학","합계","평균"); 
		System.out.println("-------------------------------------------");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.2f\t \n", name, kor, eng, mat, sum, avg);
		System.out.println("-------------------------------------------");
		System.out.println(); //한 줄 띄우기
	}

}
