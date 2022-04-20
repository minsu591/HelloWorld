package co.edu.practice;

import java.time.LocalTime;
import java.util.ArrayList;

public class Board {
	//게시글 번호 / 제목 / 내용 / 작성자 / 작성일시
	private int no;
	private String title;
	private ArrayList<String> content;
	private String writer;
	private LocalTime date;
	
	public Board(String title, ArrayList<String> content, String writer, LocalTime date) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<String> getContent() {
		return content;
	}
	public void setContent(ArrayList<String> content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public LocalTime getDate() {
		return date;
	}
	public void setDate(LocalTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", date=" + date
				+ "]";
	}
	
	public void printContent() {
		System.out.printf("[글 번호] %-5d [글 제목] %-5s [작성자] %-5s [날짜] %-10s \n",no,title,writer,date);
		System.out.printf("내용 : ");
	}
	
	public String toStringShort() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", date=" + date
				+ "]";
	}
	

}
