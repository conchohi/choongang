package bookexam5;

public class Array182p {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		System.out.println("----------------------");
				  //메서드 호출 => 메서드명(매개값(=인자));
//		int sum2 = add(new int[] {83,90,87});
		int[] scores1 = new int[] {83,90,87};
		int sum2 = add(scores1);
		System.out.println("총합 : " + sum2);
		System.out.println();
			
	}//end of main
	
	//add 메서드
	//접근제어자 [static] 반환타입 메서드(매개변수타입 매개변수) { //시그니처,헤더
	public static int add(int[] scores) {
		int sum = 0;
		for(int i =0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
