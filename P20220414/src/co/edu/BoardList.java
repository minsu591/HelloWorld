package co.edu;

public class BoardList {
	private Board[] boards;
	
	//메소드 - 초기값 지정
	public void init(int size) {
		boards = new Board[size]; //ex) 3개의 게시글
				
	}
	// 배열에 한 건 입력
	public void addBoard(Board board) {
		for (int i = 0; i<boards.length;i++) {
			if(boards[i]==null) {
				boards[i] = board;
				break;
			}
		}
	}
	
	//수정
	public void modifyBoard() {
		
	}
}
