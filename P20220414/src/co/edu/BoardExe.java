package co.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

class User {
	// 아이디, 비밀번호, 사용자명
	private String userId;
	private String passwd;
	private String userName;

	public User(String userId, String passwd, String userName) {
		super();
		this.userId = userId;
		this.passwd = passwd;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}

public class BoardExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		User[] users = { new User("user1", "1234", "홍길동"), new User("user2", "2222", "김길동"),
				new User("user3", "3333", "박길동") };
		
		BoardList boardlist = new BoardList();
		int size = 5;
		boardlist.init(size);
		boolean run = true;
		User loginUser = null;
		
		// 아이디와 비밀번호 체크하는 기능
		// 로그인되면 사용자 님 환영합니다. 문구
		// 로그인하면 로그인한 사람의 정보가 작성자로 들어가게
		while (run) {
			System.out.print("아이디를 입력하세요 : ");
			String id = scn.next();
			System.out.print("비밀번호를 입력하세요 : ");
			String passwd = scn.next();
			for (int i = 0; i < users.length; i++) {
				if (id != null && passwd != null && users[i].getUserId().equals(id)
						&& users[i].getPasswd().equals(passwd)) {
					loginUser = new User(id, passwd, users[i].getUserName());
					System.out.println(loginUser.getUserName() + "님 환영합니다!");
					run =false;
					break;
				}
			}
			if(run) {
				System.out.println("아이디나 패스워드가 일치하지 않습니다.");
			}
		}


		//게시판 이용 기능
		// BoardList에 정의 해놓은 필드와 메소드를 활용해서 기능
		while (true) {
			int sel = -1;
			System.out.println("-----------------------------");
			System.out.println("1. 추가 | 2. 수정 | 3. 목록 | 4. 삭제 | 5. 글 번호 조회 | 6. 작성자 조회 | 9. 종료");
			System.out.println("-----------------------------");
			System.out.print("선택 >>> ");
			try {
				sel = scn.nextInt(); // 사용자가 입력한 값을 int형으로 반환 -> 문자를 넣었다? -> 예외처리 필요
			} catch (InputMismatchException e) {
				System.out.println("잘못된 시도입니다.");
//				e.printStackTrace(); //오류 출력
				scn.nextLine();
				continue;
			}

			if (sel == 1) { // 추가
//				System.out.print("추가할 게시글의 번호를 입력하세요 : ");
//				int bNo = scn.nextInt();
				System.out.print("제목을 입력하세요 : ");
				String bTitle = scn.next();
				System.out.print("내용을 입력하세요 : ");
				String bContent = scn.next();
				Board newBoard = new Board(0, bTitle, bContent, loginUser.getUserName());
				boardlist.addBoard(newBoard);
			} else if (sel == 2) { // 수정
				System.out.print("수정할 게시글의 번호를 입력하세요 : ");
				int bNo = scn.nextInt();
				System.out.print("수정할 제목을 입력하세요 : ");
				String bTitle = scn.next();
				System.out.print("수정할 내용을 입력하세요 : ");
				String bContent = scn.next();
				Board changeBoard = new Board(bNo, bTitle, bContent, null); //modifyBoard에서 작성자 이름은 사용되지 않아서 null이 상관 없음
				boolean check = boardlist.modifyBoard(changeBoard);

				if (check) {
					System.out.println("수정이 완료되었습니다.");
				} else {
					System.out.println("존재하지 않는 게시글입니다.");
				}

			} else if (sel == 3) { // 목록 조회
				System.out.println("게시글번호    제목     내용           작성자    조회수");
				System.out.println("==============================================");
				for (int i = 0; i < boardlist.boardList().length; i++) {
					if (boardlist.boardList()[i] != null) {
						boardlist.boardList()[i].getInfo();
					}
				}

			} else if (sel == 4) { // 글 삭제, 두 번 묻기
				boolean check = false;
				System.out.print("삭제할 게시판의 번호를 입력하세요 : ");
				int bNo = scn.nextInt();
				System.out.print("정말로 삭제하시겠습니까? (Y/N) : ");
				String ans = scn.next();
				if (ans.equalsIgnoreCase("y")) { // 대소문자 구분없이 문자열만 비교
					check = boardlist.removeBoard(bNo);
					if (check) {
						System.out.println("삭제 완료되었습니다.");
					}else {
						System.out.println("비어있는 게시글입니다."); //check = false일 때는 null인거
					}
				} else {
					System.out.println("삭제에 실패하였습니다.");
				}

			} else if (sel == 5) { // 글 번호 조회
				System.out.print("조회하고 싶은 게시물 번호를 입력하세요 >>> ");
				int searchNo = scn.nextInt();
				Board getBoard = boardlist.searchBoard(searchNo);
				
				if (getBoard != null) {
					getBoard.getInfo();
				} else {
					System.out.println("조회 결과가 없습니다.");
				}

			} else if (sel == 6) { // 작성자의 이름을 넣으면 작성자가 쓴 글을 가져옴
				System.out.print("조회하고 싶은 작성자를 입력하세요 : ");
				String searchWriter = scn.next();
//				boolean check = boardlist.searchWrBoard(searchWriter);
				Board[] writerList = boardlist.getWriterList(searchWriter);
				// writerList 내용 출력
				System.out.println("게시글번호    제목     내용           작성자    조회수");
				System.out.println("==============================================");
				for (Board board : writerList) {
					if (board != null) {
						board.getInfo();
					}
				}

			}
		
			else if (sel == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 메뉴를 선택하세요.");
			}
		}

	}
}
