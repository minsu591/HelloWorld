package co.edu;

import java.util.Scanner;

public class ReBoardList {
	Scanner scn = new Scanner(System.in);
	private ReBoard[] boards;
	private int size;
	
	//생성자 없음
	
	//ReBoard배열 초기화
	public void init(int size) {
		this.size = size;
		boards = new ReBoard[size];
	}
	
	//게시글 추가
	public void addBoard() {
		System.out.print("추가할 게시글의 제목을 입력해주세요. >>> ");
		String newTitle = scn.next();
		System.out.print("추가할 게시글의 내용을 입력해주세요. >>> ");
		String newContent = scn.next();
		System.out.print("추가할 게시글의 작성자를 입력해주세요. >>> ");
		String newWriter = scn.next();
		ReBoard newBoard;
		for(int i = 0; i<boards.length;i++) {
			if(boards[i] == null ) {
				newBoard = new ReBoard(i,newTitle,newContent,newWriter,0);
				boards[i]=newBoard;
				System.out.println("추가가 완료되었습니다.");
				break;
			}
		}
	}
	
	//게시글 수정
	public void modifyBoard() {
		System.out.printf("수정할 게시글의 번호를 입력해주세요");
		int searchNo = scn.nextInt();
		//searchNo가 배열의 길이 내고 해당 게시글이 비어있지 않으면
		if(searchNo <= boards.length && searchNo >= 0 && boards[searchNo] != null) {
			System.out.println("[...수정중...]");
			System.out.printf("새로운 게시글의 제목을 입력해주세요 >>> ");
			String newTitle = scn.next();
			System.out.printf("새로운 게시글의 내용을 입력해주세요 >>> ");
			String newContent = scn.next();
			boards[searchNo].setTitle(newTitle);
			boards[searchNo].setContent(newContent);
			System.out.println("[수정완료!]");
		}else {
			System.out.println("존재하지 않는 게시글입니다.");
		}
	}
	
	//게시글 삭제
	public void removeBoard() {
		System.out.print("삭제할 게시글의 번호를 입력해주세요 >>> ");
		int searchNo = scn.nextInt();
		//searchNo가 배열의 길이 내고 해당 게시글이 비어있지 않으면
		if(searchNo <= boards.length && searchNo >= 0 && boards[searchNo] != null) {
			System.out.println("정말로 삭제하시겠습니까? (Y/N)");
			String ans = scn.next();
			if(ans.equalsIgnoreCase("y")) {
				System.out.println("[...삭제중...]");
				boards[searchNo]=null;
				System.out.println("[삭제완료!]");
			}else {
				System.out.println("삭제를 취소했습니다.");
			}
		}else {
			System.out.println("존재하지 않는 게시글입니다.");
		}
	}
	//게시글 조회 (작성자 이름으로)
	public void getWriterList() {
		System.out.print("조회할 작성자를 입력해주세요 >>> ");
		String searchWr = scn.next();
		System.out.printf("%2s  %5s  %5s  %3s  %3s\n","번호","제목","내용","작성자","조회수");
		for(int i = 0; i<boards.length;i++) {
			if(boards[i]!=null && boards[i].getWriter().equals(searchWr)) {
				boards[i].getInfo();
			}
		}
	}
	
	//게시글 번호 넣으면 조회수 증가
	public void searchBoard() {
		System.out.print("조회할 게시글 번호를 입력해주세요 >>> ");
		int searchNo = scn.nextInt();
		System.out.printf("%2s  %5s  %5s  %3s  %3s\n","번호","제목","내용","작성자","조회수");
		if(boards[searchNo] != null) {
			int viewNo = boards[searchNo].getSearchCnt();
			boards[searchNo].setSearchCnt(viewNo+1);
			boards[searchNo].getInfo();
		}
	}
	
	//게시글 목록 조회
	public void boardList() {
		System.out.printf("%2s  %5s  %5s  %3s  %3s\n","번호","제목","내용","작성자","조회수");
		for(ReBoard board : boards) {
			if(board != null) {
				board.getInfo();				
			}
		}
	}
		

}
