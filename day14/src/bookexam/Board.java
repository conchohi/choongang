package bookexam;

import java.time.LocalDate;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	
	Board(String title, String content){
		this(title,content,"로그인한 회원 아이디");
	}
	Board(String title, String content,String writer){
		this(title,content,writer,LocalDate.now().toString());
	}
	Board(String title, String content, String writer, String date){
		this(title,content,writer,date,0);
	}
	
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}
