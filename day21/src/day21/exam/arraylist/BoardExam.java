package day21.exam.arraylist;

import java.util.*;

public class BoardExam {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목 1", "내용 1", "글쓴이 1"));
		list.add(new Board("제목 2", "내용 2", "글쓴이 2"));
		list.add(new Board("제목 3", "내용 3", "글쓴이 3"));
		list.add(new Board("제목 4", "내용 4", "글쓴이 4"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Board board : list) {
			//print나 println 메소드는 매개값으로
			//객체나 배열, 참조변수를 넣으면
			//toString을 호출한다.
			System.out.println(board);
		}
	}

}
