package co.edu;

import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		//BoardList에 정의 해놓은 필드와 메소드를 활용해서 기능
		Scanner scn = new Scanner(System.in);
		BoardList boardlist = new BoardList();
		int size = 5;
		boardlist.init(size);
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1. 추가 | 2. 수정 | 3. 목록 | 4. 삭제 | 5. 글 번호 조회 | 6. 작성자 조회 | 9. 종료");
			System.out.println("-----------------------------");
			System.out.print("선택 >>> ");
			int sel = scn.nextInt();
			
			if(sel == 1) { //추가
				System.out.print("추가할 게시글의 번호를 입력하세요 : ");
				int bNo = scn.nextInt();
				System.out.print("제목을 입력하세요 : ");
				String bTitle = scn.next();
				System.out.print("내용을 입력하세요 : ");
				String bContent = scn.next();
				System.out.print("작성자를 입력하세요 : ");
				String bWriter = scn.next();
//				boardlist.boardList()[bNo].setContent(bContent);
//				boardlist.boardList()[bNo].setTitle(bTitle);
//				boardlist.boardList()[bNo].setWriter(bWriter);
				Board newBoard = new Board(bNo, bTitle, bContent, bWriter);
				boardlist.addBoard(newBoard);
			}else if(sel == 2) { //수정
				System.out.print("수정할 게시글의 번호를 입력하세요 : ");
				int bNo = scn.nextInt();
				System.out.print("수정할 제목을 입력하세요 : ");
				String bTitle = scn.next();
				System.out.print("수정할 내용을 입력하세요 : ");
				String bContent = scn.next();
				Board changeBoard = new Board(bNo,bTitle,bContent,null);
				boolean check = boardlist.modifyBoard(changeBoard);
				
				if(check) {
					System.out.println("수정이 완료되었습니다.");
				}else {
					System.out.println("수정이 실패하였습니다.");
				}
				
			}else if(sel ==3) { //목록 조회
				System.out.println("게시글번호    제목     내용           작성자    조회수");
				System.out.println("==============================================");
				for(int i= 0; i<boardlist.boardList().length;i++) {
					if(boardlist.boardList()[i]!=null) {
						boardlist.boardList()[i].getInfo();
					}
				}
				
//				for(Board board : boardlist.boardList()) {
//					if(board != null) {
//						board.getInfo();
//					}
//				}
				
			}else if(sel ==4) { //글 삭제, 두 번 묻기
				boolean check = false;
				System.out.print("삭제할 게시판의 번호를 입력하세요 : ");
				int bNo = scn.nextInt();
				System.out.print("정말로 삭제하시겠습니까? (Y/N) : ");
				String ans = scn.next();
				if(ans.equalsIgnoreCase("y")) { //대소문자 구분없이 문자열만 비교
					check = boardlist.removeBoard(bNo);
					if(check) {
						System.out.println("삭제 완료되었습니다.");
					}else {
						System.out.println("삭제에 실패하였습니다.");
					}
				}else {
					System.out.println("삭제에 실패하였습니다.");
				}
				
			}else if (sel ==5) { //글 번호 조회
				System.out.print("조회하고 싶은 게시물 번호를 입력하세요 >>> ");
				int searchNo = scn.nextInt();
				Board getBoard = boardlist.searchBoard(searchNo);
				if(getBoard != null) {
					getBoard.getInfo();
				}else {
					System.out.println("조회 결과가 없습니다.");
				}
				
			}else if (sel ==6) { //작성자 조회
				System.out.print("조회하고 싶은 작성자를 입력하세요 : ");
				String searchWriter = scn.next();
				System.out.println("게시글번호    제목     내용           작성자    조회수");
				System.out.println("==============================================");
				boolean check = boardlist.searchWrBoard(searchWriter);
				
				
			}else if (sel == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("정확한 메뉴를 선택하세요.");
			}
		}
		
	}
}
