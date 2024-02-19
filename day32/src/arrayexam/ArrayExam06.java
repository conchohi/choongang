package arrayexam;

import java.util.Scanner;

public class ArrayExam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 자료의 수를 입력 >> ");
		int num = sc.nextInt();
		int[] find = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("find[" + i + "] = ");
			find[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.print("찾는 값 : ");
		int findNum = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			if(findNum == find[i]) {
				System.out.println(findNum + "은 find[" + i + "]에 있습니다");
				break;
			}
			if(i == num-1) {
				System.out.println(findNum+ "은 find[] 배열에 없습니다.");
			}
		}
		sc.close();
		
	}

}
