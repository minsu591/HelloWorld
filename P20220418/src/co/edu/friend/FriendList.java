package co.edu.friend;

import java.util.Scanner;

public class FriendList {
	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Friend[] friends = new Friend[10];
		// 입력방식
//		friends[0] = new UnivFriend("홍길동", "010-1111-2222", "대구대학교", "컴퓨터 정보");
//		friends[1] = new ComFriend("김길동", "010-8888-4444", "자바기업", "개발팀");
//		friends[2] = new Friend("박길동", "010-4512-5888");

		while (true) {
			System.out.println("1. 친구등록 | 2. 리스트 | 3. 조회(이름) | 4. 종료");
			System.out.print("선택 >>> ");
			int menu = scn.nextInt();

			if (menu == 1) { // 친구 등록
				System.out.println("1. 일반 친구 | 2. 학교 친구 | 3. 회사 친구");
				System.out.print("선택 >>> ");
				int sel = scn.nextInt();
				
				//배열 빈 위치에 넣기
				int saveNo = -1;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						saveNo = i;
						break;
					}
				}

				if (sel == 1) {
					Friend newFriend = new Friend(null, null);
					friends[saveNo] = newFriend.addFriend();

				} else if (sel == 2) {
					UnivFriend newuniv = new UnivFriend(null, null, null, null);
					friends[saveNo] = newuniv.addFriend();

				} else if (sel == 3) {
					ComFriend newCom = new ComFriend(null, null, null, null);
					friends[saveNo] = newCom.addFriend();

				} else {
					System.out.println("잘못된 입력입니다.");
				}
				if (saveNo > -1) {
					System.out.println("등록이 완료되었습니다.");
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
