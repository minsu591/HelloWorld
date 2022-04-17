package co.edu;

import java.util.Scanner;

public class ReBoardExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ReBoardList boardlist = new ReBoardList();
		int size = 10;
		boardlist.init(size);
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("1. 추가 | 2. 수정 | 3. 삭제 | 4. 작성자 조회 | 5. 글 조회 | 6. 목록 조회 | 9. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택 >>> ");
			int menu = scn.nextInt();
			
			if(menu == 1) {
				boardlist.addBoard();
			}else if(menu ==2) {
				boardlist.modifyBoard();
			}else if(menu==3) {
				boardlist.removeBoard();
			}else if(menu == 4) {
				boardlist.getWriterList();
			}else if(menu == 5) {
				boardlist.searchBoard();
			}else if(menu==6) {
				boardlist.boardList();;
			}else if(menu==9) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

}
