package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

// 친구목록을 저장하기 위한 App.
// 추가, 수정, 삭제, 조회
// version 1. 배열 2. 컬렉션 -> 메소드 이름 통일되게
// interface 구현하기
public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		FriendService service = new FriendServiceArray();
//		service = new FriendServiceList();

		// 추가, 수정, 삭제, 조회 => 컨트롤 역할
		while (true) {
			System.out.println("1. 추가 | 2. 수정 | 3. 삭제 | 4. 조회 | 5. 전체 조회");
			System.out.print("선택 >>> ");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("추가할 친구의 이름을 입력해주세요 >>> ");
				String name = scn.next();
				System.out.print("추가할 친구의 연락처를 입력해주세요 >>> ");
				String phone = scn.next();
				Friend friend = new Friend(name, phone);
				service.addFriend(friend);
			} else if (menu == 2) {
				System.out.print("수정할 친구의 이름을 입력해주세요 >>> ");
				String name = scn.next();
				Friend friend = new Friend(name, null);
				service.modFriend(friend);

			} else if (menu == 3) {
				System.out.print("삭제할 친구의 이름을 입력해주세요 >>> ");
				String name = scn.next();
				service.remFriend(name);

			} else if (menu == 4) {
				System.out.print("조회할 친구의 이름을 입력해주세요 >>> ");
				String name = scn.next();
				Friend searchFriend = service.findFriend(name);
				if(searchFriend != null) {
					System.out.println(searchFriend.toString());					
				}else {
					System.out.println("존재하지 않는 친구입니다.");
				}
			}else if(menu ==5) {
				System.out.println("전체 조회합니다.");
				service.allsearchFriend();
			}
			
			else {
				System.out.println("시스템을 종료합니다.");
				break;

			}
		}
	}

}
