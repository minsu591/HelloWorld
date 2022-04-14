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
	public int addBoard(Board board) {
		int errorCase = -1;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				errorCase = 0; // 처리 성공
				break;
			} else if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				// 고른 번호에 자리가 없을 때
				errorCase = 1;
				System.out.println("추가할 게시글 번호를 다시 골라주세요");
				break;
			}
		}
		return errorCase;
	}

	// 수정 : 게시글 번호로 찾아서 내용과 제목을 바꾸기
	public boolean modifyBoard(Board board) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (board.getBoardNo() == boards[i].getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
			}
		}
		return check;
	}
	//게시판 번호를 선택하고 해당 게시판 삭제
	public boolean removeBoard(int bNo) {
		boolean check = false;
		for(int i = 0; i<boards.length;i++) {
			if(bNo == boards[i].getBoardNo()) {
				boards[i]=null;
				return check = true;
			}
		}
		return check;
	}
	
	//작성자 이름을 입력하면 작성자 조회 (글이 여러개 나올 수 있음)
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
	
	//한건 조회 -> 게시글 번호 넣으면 조회수 1 올라가게
	public Board searchBoard(int bNo) {
		for(int i = 0; i<boards.length;i++) {
			if(boards[i]!=null) {
				if(boards[i].getBoardNo()==bNo) {
					int currentCut = boards[i].getSearchCnt();
					boards[i].setSearchCnt(currentCut++);
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
	
	
}
