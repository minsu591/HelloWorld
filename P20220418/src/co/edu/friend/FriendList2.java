package co.edu.friend;

import java.util.Scanner;

public class FriendList2 {
	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//한 번 설정하고 나면 바꿀 수 없는 변수 : final
		final String val = "Hong";
//		val = "hi2"; //X 할당 불가
		
		Friend[] friends = new Friend[10];
		
		while (true) {
			System.out.println("1. 친구등록 | 2. 리스트 | 3. 조회(이름) | 4. 종료");
			System.out.print("선택 >>> ");
			int menu = scn.nextInt();

			if (menu == 1) { // 친구 등록
				System.out.println("1. 일반 친구 | 2. 학교 친구 | 3. 회사 친구");
				System.out.print("선택 >>> ");
				int sel = scn.nextInt();
				Friend newFriend = null;

				System.out.print("친구 이름 >>> ");
				String name = scn.next();
				System.out.print("친구 연락처 >>> ");
				String phone = scn.next();

				if (sel == 1) {
					newFriend = new Friend(name, phone);

				} else if (sel == 2) {
					System.out.print("친구의 학교를 입력해주세요 >>> ");
					String univ = scn.next();
					System.out.print("친구의 전공을 입력해주세요 >>> ");
					String major = scn.next();
					newFriend = new UnivFriend(name, phone, univ, major);

				} else if (sel == 3) {
					System.out.print("친구의 회사를 입력해주세요 >>> ");
					String com = scn.next();
					System.out.print("친구의 부서를 입력해주세요 >>> ");
					String depart = scn.next();
					newFriend = new ComFriend(name, phone, com, depart);

				} else {
					System.out.println("잘못된 입력입니다.");
				}
				if(newFriend !=null) {
					System.out.println("등록이 완료되었습니다.");
				}

				// 배열 빈 위치에 넣기
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = newFriend;
						break;
					}
				}

			} else if (menu == 2) { // 리스트
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.println(friends[i].toString());
					}
				}

			} else if (menu == 3) { // 이름 조회
				System.out.print("조회할 이름을 입력해주세요 >>> ");
				String searchName = scn.next();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].getName().equals(searchName)) {
						System.out.println(friends[i].toString());
					}
				}

			} else if (menu == 4) {
				System.out.println("시스템을 종료합니다.");
				break;

			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주십시오.");
			}
		}
		scn.close();
	}

}
