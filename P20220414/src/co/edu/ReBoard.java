package co.edu;

public class ReBoard {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private int searchCnt = 0;
	
	public ReBoard(int boardNo, String title, String content, String writer, int searchCnt) {
		this.boardNo = boardNo;
		this.content = content;
		this.title = title;
		this.writer = writer;
		this.searchCnt = searchCnt;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getSearchCnt() {
		return searchCnt;
	}

	public void setSearchCnt(int searchCnt) {
		this.searchCnt = searchCnt;
	}
	
	public void getInfo() {
		System.out.printf("%2d  %5s  %5s  %3s  %2d\n",this.boardNo, this.title,this.content,this.writer,this.searchCnt);
	}


	
	

}
