package co.edu;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // 기본 생성자가 없어서 System.in을 넣는 것
		Member m1 = new Member("user1", "사용자1", "012-2334-3234", 21);
		m1.setMemberAge(-12);
		System.out.println("나이 : " + m1.getMemberAge());
		m1.setMemberId("user01");
		System.out.println("아이디 : " + m1.getMemberId());

		// 멤버 배열 + 사용자가 값 입력하는 기능
		Member[] members = new Member[3];
		for (int i = 0; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이 순으로 입력하세요.");
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			int age = Integer.parseInt(scn.next());
			Member newMember = new Member(id, name, phone, age);
			members[i] = newMember;
		}

		// 1. 조회(이름) 2. 변경(id = key)(중복값 없게 id 변경) (아이디를 넣으면 연락처를 변경할 수 있게)
		// 3. 입력했던 나이보다 큰 회원만 조회하기 4. 프로그램 종료
		while (true) {
			System.out.println("------------------------------------------");
			System.out.println("1. 이름 조회 | 2. 연락처 변경 | 3. 나이보다 큰 회원 조회 | 4. 프로그램 종료 | 그외. 사용자 조회");
			System.out.println("------------------------------------------");
			System.out.print("선택 >>> ");
			int menu = scn.nextInt();
			
			if (menu == 1) { // 이름이 같아도 다 조회
				System.out.print("조회할 이름을 입력하세요 : ");
				String searchName = scn.next();
				boolean flag = true;
				for (Member i : members) {
					if (i.getMemberName().equals(searchName)) {
						i.showInfo();
						flag = false;
					}
				}
				if (flag) {
					System.out.println("해당 회원이 존재하지 않습니다.");
				}
			} else if (menu == 2) {
				System.out.print("연락처를 변경할 id를 입력하세요 : ");
				String searchId = scn.next();
				boolean flag = true;
				for (Member i : members) {
					if (i.getMemberId().equals(searchId)) {
						System.out.print("변경할 연락처를 입력해주세요 >>> ");
						String changePw = scn.next();
						i.setMemberPhone(changePw);
						System.out.println("연락처 변경이 완료되었습니다.");
						flag = false;
						break; // id 유일
					}
				}
				if (flag) {
					System.out.println("해당 id가 존재하지 않습니다.");
				}
			} else if (menu == 3) {
				System.out.print("회원을 조회할 나이를 입력하세요 >>> ");
				int searchAge = scn.nextInt();
				System.out.println(searchAge + "세 이상의 회원들을 조회합니다.");
				for (Member i : members) {
					if (i.getMemberAge() >= searchAge) {
						i.showInfo();
					}
				}
			} else if (menu == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				for (Member i : members) {
					i.showInfo();
				}
			}
		}

	}

}
