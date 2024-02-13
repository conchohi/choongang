package generic;


public class StudentsScoreExam {
	//#1. 최고점수를 찾는 메소드 - findBest(Score[] arr) - 일반 메소드로 작성
	public static Score findBest(Score[] engArr) {
		//#1) max를 찾기 위해, 배열의 처음 요소의 값을 max에 담기
		Score max = engArr[0];
		
		//#2) 최고 점수 찾기
		for(int i = 1; i < engArr.length; i++) {
			if(max.compareTo(engArr[i]) < 0) {
				max = engArr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		EnglishScore[] engArr = {
				new EnglishScore("홍길동", 90),
				new EnglishScore("우영우", 89),
				new EnglishScore("최수연", 97),
				new EnglishScore("이준호", 67),
				new EnglishScore("정명석", 48)
		};
		
		MathScore[] mathArr = {
				new MathScore("홍길동", 55),
				new MathScore("우영우", 89),
				new MathScore("최수연", 70),
				new MathScore("이준호", 96),
				new MathScore("정명석", 60)
		};
		
		System.out.println("영어 최고 점수 : " + findBest(engArr));
		System.out.println("수학 최고 점수 : " + findBest(mathArr));
		
		
	}

}
