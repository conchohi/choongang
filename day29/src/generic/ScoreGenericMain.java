package generic;

public class ScoreGenericMain {
	//#1. Generic 메소드 이용
	// [접근제한자] <타입> 반환타입 메소드명(매개변수, ...){}
	//					compareTo를 쓰기 위해 부모 타입을 제한
	// Comparable은 EnglishScore와 MathScore가 구현하고 있음
	public static <T extends Comparable<T>> T findBest(T[] score) {
		T max = score[0];
		for(int i = 1; i < score.length; i++) {
			if(max.compareTo(score[i]) < 0) {
				max = score[i];
			}//end of if
		}//end of for
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
