package co.edu.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardApp boardlist = new BoardApp();
		UserService userlist = new UserService();
		int loginNo = -1;
		
		//로그인
		while(true) {
			System.out.print("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print("선택 >>> ");
			int sel = scn.nextInt();
			if(sel == 1) {
				userlist.createAccount();
				
			}else if(sel ==2) {
				loginNo = userlist.login();
				if(loginNo!=-1) {
					break;
				}else {
					System.out.println("존재하지 않는 id입니다.");
				}
				
			}else if(sel ==3) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
		}
		
		//현재 로그인 정보 얻기
		User nowUser = userlist.returnAccount(loginNo);
		
		//게시판 이용
		while(true) {
			
			System.out.println("1. 글 등록 | 2. 글 수정 | 3. 글 삭제 | 4. 글 상세조회(글 번호) | 5. 전체 글 조회 | 6. 종료");
			System.out.print("선택 >>> ");
			int menu = 0;
			try {
				menu = scn.nextInt();				
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				scn.nextLine();
			}
			
			if(menu == BoardService.ADD) {
				boardlist.printResult(boardlist.add(nowUser));
			}else if(menu == BoardService.MOD) {
				boardlist.printResult(boardlist.mod());
			}else if(menu == BoardService.REM) {
				boardlist.printResult(boardlist.rem());
			}else if(menu == BoardService.LIST) {
				boardlist.printResult(boardlist.list());
			}else if(menu == BoardService.LISTA) {
				boardlist.printResult(boardlist.listall());
			}else if(menu == BoardService.END) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}

}
