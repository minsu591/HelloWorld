package co.edu.nested;

import java.util.Scanner;

class Friend {
	String name;
	String phone;
	int age;

	public Friend(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}

}

public class NestedApp {
	static Scanner scn = new Scanner(System.in); //스캐너
	static Friend[] friends = new Friend[10];

	// 중첩 인터페이스
	interface FriendService {
		// 추가, 수정, 목록

		// 인터페이스에는 상수만 들어올 것
		int ADD = 1;
		int MOD = 2;
		int REM = 3;
		int LIST = 4;

		void add();

		void modify();

		void remove();

		void list();
	}
	

	// 중첩 클래스
	static class FriendApp implements FriendService {
		@Override
		public void add() {
			System.out.print("추가할 이름 >>> ");
			String name = scn.next(); // Scanner도 static처리
			System.out.print("추가할 연락처 >>> ");
			String phone = scn.next();
			System.out.print("나이 >>> ");
			int age = scn.nextInt();
			Friend f = new Friend(name, phone, age);

			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = f;
					break;
				}
			}
		}

		@Override
		public void modify() {
			System.out.print("수정하고싶은 이름 >>> ");
			String name = scn.next();
			System.out.print("수정하고싶은 연락처 >>> ");
			String phone = scn.next();
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null && friends[i].getName().equals(name) && friends[i].getPhone().equals(phone)) {
					System.out.print("변경할 전화번호 >>> ");
					String newPhone = scn.next();
					friends[i].setPhone(newPhone);
					System.out.println("수정 완료");
				}
			}
		}

		@Override
		public void remove() {
			System.out.print("삭제할 이름 >>> ");
			String name = scn.next();
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null && friends[i].getName().equals(name)) {
					friends[i] = null;
					System.out.println("삭제가 완료되었습니다.");
				}
			}
		}

		@Override
		public void list() { // 배열에 저장되어있는 값을 출력
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null) {
					System.out.println(friends[i].toString());
				}
			}
		}
	}

	public static void main(String[] args) {
		Friend f = new Friend("hi","dd",0);
		FriendApp app = new FriendApp();
		System.out.println("[Array]");
		while (true) {
			System.out.println("1. 추가 | 2. 수정 | 3. 제거 | 4. 목록 | 나머지 : 종료");
			System.out.print("선택 >>> ");
			int sel = scn.nextInt();
			if (sel == FriendService.ADD) {
				app.add();
			} else if (sel == FriendService.MOD) {
				app.modify();
			} else if (sel == FriendService.REM) {
				app.remove();
			} else if (sel == FriendService.LIST) {
				app.list();
			} else {
				System.out.println("시스템 종료");
				break;
			}

		}

	}
}
