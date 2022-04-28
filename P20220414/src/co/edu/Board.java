package co.edu;

public class Board {
	//게시글을 위한 기본 필드
	//게시글 번호, 제목, 내용, 작성자, 조회횟수 (조회할 때마다 증가)
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private int searchCnt=0;
	
	//정적 인스턴스 (클래스 존재와 동시에 사용가능, 선언할 필요없음)
	static int writeDate;
	
	//생성자
	public Board(int boardNo, String title, String content, String writer) {
		super(); //부모 클래스의 생성자를 호출
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	//get, set 메소드
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
	
	//한 줄 보여주는 기능
	public void getInfo() {
		//게시글 번호  제목  내용  작성자  조회수
		System.out.printf("%3d %10s %15s %4s %2d\n", this.boardNo, this.title, this.content, this.writer, this.searchCnt);
	}

	@Override //어노테이션 - 부모 클래스가 가진 toString을 자식 클래스가 재정의하겠다 : Overriding
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", searchCnt=" + searchCnt + "]";
	}
	
	
	
	
}
