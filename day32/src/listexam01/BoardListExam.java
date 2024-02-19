package listexam01;

import java.util.ArrayList;
import java.util.List;

public class BoardListExam {

	public static void main(String[] args) {
		List<Board> boards = new ArrayList<>();
		boards.add(new Board("제목1", "글쓴이1", "내용1"));
		boards.add(new Board("제목2", "글쓴이2", "내용2"));
		boards.add(new Board("제목3", "글쓴이1", "내용3"));
		boards.add(new Board("제목4", "글쓴이3", "내용4"));
		for (Board board : boards) {
			board.showInfo();
			System.out.println("----------");
		}
	}

}
