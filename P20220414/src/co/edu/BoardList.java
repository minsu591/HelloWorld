package co.edu;

import java.util.Scanner;

public class BoardList {
	Scanner scn = new Scanner(System.in);
	private Board[] boards;

	// 게시판 기능
	// 메소드 - 초기값 지정
	public void init(int size) {
		boards = new Board[size]; // ex) 3개의 게시글
	}

	// 배열에 한 건 입력
	public void addBoard(Board addBoard) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				addBoard.setBoardNo(i);
				boards[i] = addBoard;
				break;
			} else if (boards[i] != null && boards[i].getBoardNo()==boards.length-1) {
				// 고른 번호에 자리가 없을 때
				System.out.println("게시글 추가할 자리가 없습니다.");
				break;
			}
		}
	}

	// 수정 : 게시글 번호로 찾아서 내용과 제목을 바꾸기
	public boolean modifyBoard(Board board) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if(boards[i]!=null) {
				if (board.getBoardNo() == boards[i].getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
				}
			}
			
		}
		return check;
	}
	//게시판 번호를 선택하고 해당 게시판 삭제
	public boolean removeBoard(int bNo) {
		boolean check = false;
		for(int i = 0; i<boards.length;i++) {
			if(boards[i] != null) {
				if(bNo == boards[i].getBoardNo()) {
					boards[i]=null;
					return check = true;
				}
			}
		}
		return check;
	}
	
	//작성자 이름을 입력하면 글 조회 (글이 여러개 나올 수 있음)
	public boolean searchWrBoard(String bWr) {
		boolean check = false;
		if(bWr == null) {
			System.out.println("조회 결과가 없습니다.");
		}else {
			for(int i = 0; i<boards.length;i++) {
				if(boards[i]!=null) {
					if(boards[i].getWriter().equals(bWr)) {
						if(!(boards[i]==null || boards[i].getContent().isEmpty())) {
							boards[i].getInfo();
							check = true;
						}
					}
				}
			}
		}
		return check;
	}
	
	//한건 조회 -> 게시글 번호 넣으면 조회수 1 올라가게 (게시글 번호 1개 -> 맨 앞에 있는 한 개만 조사)
	//input : 게시글 번호 output : Board (봤던 게시글)
	public Board searchBoard(int bNo) {
		for(int i = 0; i<boards.length;i++) {
			if(boards[i]!=null) {
				if(boards[i].getBoardNo()==bNo) {
					int currentCut = boards[i].getSearchCnt();
					boards[i].setSearchCnt(currentCut+1);
					return boards[i];
				}
			}
		}
		return null;
	}
	
	//게시글 목록 조회
	public Board[] boardList() {
		return boards;
	}
	
	//작성자 조회기능
	public Board[] getWriterList(String Writer) {
		Board[] sBoards = new Board[5];
		for(int i = 0; i<boards.length;i++) {
			if(boards[i]!=null && boards[i].getWriter().equals(Writer)) { //null 아닌 조건 넣기
				for(int j = 0; j<sBoards.length;j++) { //sBoards도 null인 곳을 찾아서 넣을 것
					if(sBoards[j]==null) {
						sBoards[j]=boards[i];
						break;
					}
				}
			}
		}
		return sBoards;
	}
	
	
	
}
