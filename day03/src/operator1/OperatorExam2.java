package operator1;

public class OperatorExam2 {

	public static void main(String[] args) {
		/*
		 * 문1) 연필이 357자루가 있습니다. 학생이 13명 있습니다.
		 * 	   학생당 몇 자루 씩 나누어 주어야 할까요?
		 * 	   그리고 나머지는 몇 자루인가요?
		 * 	   즉, 학생 1인당 받을 연필 개수와 나눠주고 남은 연필의 개수 구하기
		 */
		//#1. 변수 선언
		int pencils = 357; //연필 개수
		int students = 13; //학생 수
		int pencilsPerStudent = 0;
		int restPencils = 0;
		//#2. 계산
		pencilsPerStudent = pencils / students; //1인당 연필 개수 = 연필 개수 / 학생 수
		restPencils = pencils % students; //남은 연필 수 = 연필 개수 % 학생 수
		
		//#3. 화면 출력
		System.out.println("** 연필 나누기 **");
		System.out.printf("총 연필의 개수 = %d\n학생 수 = %d\n", pencils, students);
		System.out.println("1인당 받는 연필의 개수 : " + pencilsPerStudent);
		System.out.println("남은 연필의 개수 : " + restPencils);
		
		
		}

}
