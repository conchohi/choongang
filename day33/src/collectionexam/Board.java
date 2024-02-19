package collectionexam;

public class Board {
	//필드, 인스턴스 필드 - 객체(=인스턴스)를 생성해야지만 사용할 수 있다.
	private String subject;
	private String writer;
	private String content;
	
	//생성자 - 객체를 초기화 --> new Board();
//	public Board() {}
	
	public Board(String subject, String writer, String content) {
		this.subject = subject;
		this.writer = writer;
		this.content = content;
	}
	
	public void showInfo() {
		System.out.println("제목 : " + subject);
		System.out.println("글쓴이 : " + writer);
		System.out.println("내용 : " + content);
	}

	@Override
	public String toString() {
		return "[subject=" + subject + ", writer=" + writer + ", content=" + content + "]";
	}
	
	
}
