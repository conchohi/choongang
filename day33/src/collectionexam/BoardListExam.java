package collectionexam;

import java.util.ArrayList;
import java.util.List;

public class BoardListExam {

	public static void main(String[] args) {
		//객체 생성
//		List list = new ArrayList(); //타입 정의가 없으면 무슨 객체든 삽입 가능 
//		list.add(10);
//		list.add("가");
		
		//Board 객체를 저장할 공간 만들기
		//ArrayList 컬렉션 생성
		List<Board> boards = new ArrayList<>();
		
		//공간에 객체를 담기(추가)
		boards.add(new Board("제목1", "홍길동", "내용1"));
		boards.add(new Board("제목2", "김자바", "내용2"));
		boards.add(new Board("제목3", "이강산", "내용3"));
		boards.add(new Board("제목4", "한바다", "내용4"));
		
//		System.out.println("총 객체 수 : " + boards.size());
//		System.out.println(boards);
		showPrint(boards);
		
		boards.add(new Board("제목5", "송하늘", "내용5"));
		showPrint(boards);
		
		for (Board board : boards) {
			board.showInfo();
			System.out.println("----------");
		}
	}
	public static void showPrint(List<?> list) {
		System.out.println("총 객체 수 : " + list.size());
		System.out.println(list);
		System.out.println();
	}
	
}
