package collectexam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoardExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		Map<Integer, Board> boards = new HashMap<>();
		
		while(true) {
			System.out.println("=========================================================");
			System.out.println("=========================================================");
			System.out.println("번호\t제목\t내용\t작성자\t작성일");
			System.out.println("---------------------------------------------------------");
			for(int i = boards.size() - 1; i >= 0; i--) {
				System.out.print("s");
			}
			System.out.println("=========================================================");
			System.out.print("1.등록|2.조회|0.종료 >> ");
			int option = Integer.parseInt(sc.nextLine());
			if(option == 1) {
				System.out.print("제목 > ");
				String title = sc.nextLine();
				System.out.print("내용 > ");
				String content = sc.nextLine();
				System.out.print("작성자 > ");
				String author = sc.nextLine();
				boards.put(++num, new Board(title, content, author));
			}
			
		}
	}

}
