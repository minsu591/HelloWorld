package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 친구목록을 저장하기 위한 App.
// 추가, 수정, 삭제, 조회
// version 1. 배열 2. 컬렉션 -> 메소드 이름 통일되게
// interface 구현하기
public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		FriendService service = new FriendServiceArray(); // 인스턴스에 -> 인스턴스를 상속한 클래스 배정
		service = new FriendServiceList();

		// 추가, 수정, 삭제, 조회 => 컨트롤 역할
		while (true) {
			System.out.println("1. 추가 | 2. 수정 | 3. 삭제 | 4. 조회 | 5. 전체 조회 | 6. 남자 | 7. 여자");
			System.out.print("선택 >>> ");
			int menu = scn.nextInt();
			if (menu == FriendService.ADD) {
				System.out.print("추가할 친구의 이름을 입력해주세요 >>> ");
				String name = scn.next();
				System.out.print("추가할 친구의 연락처를 입력해주세요 >>> ");
				String phone = scn.next();
				System.out.println("추가할 친구의 성별을 입력해주세요 (남자 / 여자) >>> ");
				String gender = scn.next();
				Gender gen = Gender.MEN;
				if (gender.startsWith("남")) {
					gen = Gender.MEN;
				} else if (gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(name, phone, gen);
				service.addFriend(friend);
			} else if (menu == FriendService.MOD) {
				System.out.print("수정할 친구의 이름을 입력해주세요 >>> ");
				String name = scn.next();
				System.out.print("수정할 친구의 연락처를 입력해주세요 >>> ");
				String phone = scn.next();
				Friend friend = new Friend(name, phone);
				service.modFriend(friend);

			} else if (menu == FriendService.REM) {
				System.out.print("삭제할 친구의 이름을 입력해주세요 >>> ");
				String name = scn.next();
				service.remFriend(name);

			} else if (menu == FriendService.SEARCH) {
				System.out.print("조회할 친구의 이름을 입력해주세요 >>> ");
				String name = scn.next();
				Friend searchFriend = service.findFriend(name);
				if (searchFriend != null) {
					System.out.println(searchFriend.toString());
				} else {
					System.out.println("존재하지 않는 친구입니다.");
				}
			} else if (menu == FriendService.SEARCHALL) {
				System.out.println("전체 조회합니다.");
				service.allsearchFriend();
			} else if (menu == FriendService.FIND_MEN) {// 남자
				Gender gen = Gender.MEN;
				
				
				ArrayList<Friend> list = service.findGender(gen);
				for (Friend f : list) {
					System.out.println(f.toString());
				}
			} else if (menu == FriendService.FIND_WOMEN) {// 여자
				Gender gen = Gender.WOMEN;
				ArrayList<Friend> list = service.findGender(gen);
				for (Friend f : list) {
					System.out.println(f.toString());
				}
			}else if(menu==8) { //gender return
				service.returnGender();
			}

			else {
				System.out.println("시스템을 종료합니다.");
				break;

			}
		}
	}

}
