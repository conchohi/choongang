package array2;

import java.util.Scanner;

public class Array2_2_2{

	public static void main(String[] args) {
		//문2-2) 정수를 하나 입력 받아 배열에서 같은 값이 몇 번째 요소인지 구하기, 없으면 없다고 출력
			//number = { 79, 88, 33, 100, 50, 90 }
		//출력형태)
		//1) 찾는 값 있을 때
			//찾는 값 : ~~
			//배열의 위치 : ~~
		//2) 찾는 값 없을 때
			//찾는 값이 없습니다.
		//#1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//#2. 변수 선언 
		int count = 0;
		
		//#3. 배열 변수 선언과 초기화
		int[] number = { 79, 88, 33, 100, 50, 90 };
		
		System.out.print("찾는 값을 입력하세요 >> ");
		int target = sc.nextInt();
		sc.close();

		for(int i = 0; i < number.length; i++) {
			count++;
			if(target == number[i]) {
				System.out.println("찾는 값 : " + target);
				System.out.println("배열의 요소 위치 : " + i);
				break;
			}
		}
		if(count == number.length) {
			System.out.println("찾는 값이 없습니다.");
		}
		
	} //end of main


}