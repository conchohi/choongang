package array2;

import java.util.Scanner;

public class Array2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		
		int count = 1;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
//				System.out.printf("%4d", (num * num * i) + (num * j) + 1 );
				System.out.printf("%4d", count);
				count += num;
			}
			System.out.println();
		}
		sc.close();
	}

}
