package day21.exam.arraylist;

public class Board {
	//#1. 필드
	private String subject;
	private String content;
	private String writer;
	

	//#2. 생성자
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	//#3. 메소드
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override //Object의 toString() 메소드를 재정의
	public String toString() {
		return subject + ", " + content + ", " + writer;
	}

}
