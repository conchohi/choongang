package collectexam;

import java.util.Date;

public class Board {
	private String title;
	private String content;
	private String author;
	private Date date;

	public Board(String title, String content, String author) {
		this.title = title;
		this.content = content;
		this.author = author;
		date = new Date();
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}
	
	
	
}
