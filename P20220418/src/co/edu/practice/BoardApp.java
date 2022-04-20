package co.edu.practice;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

//게시글 번호 / 제목 / 내용 / 작성자 / 작성일시
//배열 대신에 ArrayList<Board> 컬렉션사용
//1. 글 등록 | 2. 글 수정 | 3. 글 삭제 | 4. 글 상세조회(글 번호) | 5. 전체 글 조회 | 6. 종료
//필요한 클래스 : Board, BoardApp(게시판 기능 구현) <- Interface BoardService
//, BoardExe(메인 method -> 실행) + 정상적으로 처리되었습니다 문구


public class BoardApp implements BoardService {
	ArrayList<Board> boards = new ArrayList<>();
	Scanner scn = new Scanner(System.in);
	
	public ArrayList<String> inputContent() {
		ArrayList<String> content = new ArrayList<>();
		
		System.out.println("내용을 입력해주세요. (종료 : Enter)");
		while(true) {
			String st = scn.next();
			if(st.startsWith("\n")) {
				System.out.println("입력을 마칩니다.");
				break;
			}else {
				content.add(st);
			}
		}
		return content;
	}
	
	public void outputContent(ArrayList<String> content) {
		for(int i = 0; i<content.size();i++) {
			if(i==0) {
				
			}else {
				System.out.printf("%6s"," ");
			}
			System.out.println(content.get(i));
		}
	}
	
	
	public void printResult(boolean flag) {
		if (flag) {
			System.out.println("성공적으로 수행되었습니다.");
		} else {
			System.out.println("실패했습니다.");
		}
	}

	@Override
	public boolean add(User user) {
		System.out.print("추가할 글의 제목을 입력하세요 >>> ");
		String title = scn.next();
		System.out.print("추가할 글의 내용을 입력하세요 >>> ");
		ArrayList<String> content = this.inputContent();
		//작성자
		
		LocalTime now = LocalTime.now(); // 작성시간
		Board newBoard = new Board(title, content, user.getName(), now);
		boards.add(newBoard);
		newBoard.setNo(boards.size() - 1); // 항상 마지막에 추가되니까, -> 삭제 이후에 글 번호도 줄어드는 방법?
		return true;
	}

	@Override
	public boolean mod() {
		System.out.print("수정할 글의 글 번호를 입력하세요 >>> ");
		int no = scn.nextInt();
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getNo() == no) {
				System.out.print("글의 새로운 제목을 입력하세요 >>> ");
				String title = scn.next();
//				System.out.print("글의 새로운 내용을 입력하세요 >>> ");
//				String content = scn.next();
				ArrayList<String> content = this.inputContent();
				boards.get(i).setTitle(title);
				boards.get(i).setContent(content);
				LocalTime now = LocalTime.now(); // 수정하면 작성 시간도 수정되게
				boards.get(i).setDate(now);
				return true;
			}
		}
		return false;

	}

	@Override
	public boolean rem() {
		System.out.print("삭제할 글의 글 번호를 입력하세요 >>> ");
		int no = scn.nextInt();
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getNo() == no) {
				System.out.println("제목, " + boards.get(i).getTitle() + "의 삭제를 진행합니다.");
				boards.remove(i);

				// 삭제 이후 글 번호 수정
				for (int j = i; j < boards.size(); j++) {
					boards.get(j).setNo(j);
				}

				return true;
			}
		}
		return false;
	}

	@Override
	public boolean list() {
		System.out.print("조회할 글의 글 번호를 입력하세요 >>> ");
		int no = scn.nextInt();
		
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getNo() == no) {
				boards.get(i).printContent();
				this.outputContent(boards.get(i).getContent());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean listall() {
		System.out.println("[전체 조회를 진행합니다.]");
		for (int i = 0; i < boards.size(); i++) {
			System.out.println(boards.get(i).toStringShort());
		}
		return true;
	}

}
