package conditional;

public class IfExam03 {

	public static void main(String[] args) {
		/*
		문3) 홍길동이 평가를 7점 받았습니다.
			연수는 평가 점수가 5점 이상이면 신청 가능합니다.
			홍길동이 연수에 참여할 수 있는지 출력하는 프로그램 작성
		 */
		String name = "홍길동";
		int score = 7;
		
		if(score >= 5) {
			System.out.println(name + "님은 연수에 참여할 수 있습니다.");
		} else {
			System.out.println(name + "님은 연수에 참여할 수 없습니다.");
		}

	}

}
