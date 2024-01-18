package array2;

public class Array2_1_1 {

	public static void main(String[] args) {
		//문1) 다음은 홍길동반 학생들의 성적입니다. 총점과 평균을 구하는 프로그램을 작성하시오.
//		int[] score = new int[5];
//		score[0] = 100;
//		score[1] = 88;
//		score[2] = 100;
//		score[3] = 90;
//		score[4] = 50;
		
//		int[] score = new int[]{100, 88,100,90,50};
		int[] score = {100, 88,100,90,50};
		int sum = 0;
		double avg = 0.0;
		
		//#2. 계산
//		for(int s : score) {
//			sum += s;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = (double)sum / score.length;
		
		//#3. 출력
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println("홍길동반의 총점 : " + sum);
		System.out.println("홍길동반의 평균 : " + avg);	
	}

}
