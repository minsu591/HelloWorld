package co.edu.statics;

import java.util.Scanner;

import co.edu.statics.Exam4;

public class FriendList {
	private Exam4[] friends;
	Scanner scn = new Scanner(System.in);
	
	public void init(int size) {
		friends = new Exam4[size];
	}
	
	public void searchFriend() {
		System.out.print("조회할 친구의 이름을 입력해주세요 >>> ");
		String name = scn.next();
		System.out.printf("%3s %6s %11s\n", "이름", "생일", "전화번호");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) { // null 에러 생기지 않게
				if (friends[i].getName().equals(name)) {
					friends[i].getInfo();
				}

			}
		}
	}
	
	
	public void deleteFriend() {
		boolean flag = false;
		System.out.print("삭제할 친구의 이름을 입력해주세요 >>> ");
		String name = scn.next();
		System.out.println("정말로 삭제할까요? (Y/N)");
		if (scn.next().equalsIgnoreCase("y")) {
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null) { // null 에러 생기지 않게
					if (friends[i].getName().equals(name)) {
						friends[i] = null;
						flag = false;
						break;
					} else {
						flag = true;
					}

				} else {
					flag = true;
				}
			}
		} else {
			System.out.println("실행이 취소되었습니다.");
		}
		if (flag) {
			System.out.println("기존에 존재하지 않는 친구입니다.");
		}
	}
	
	public void modifyFriend() {
		boolean flag = false;
		System.out.print("수정할 친구의 이름을 입력해주세요. >>> ");
		String name = scn.next();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getName().equals(name)) {
					System.out.println("수정을 진행합니다.");
					System.out.print("수정할 전화번호를 입력해주세요. >>> ");
					String phoneNo = scn.next();
					// 중복 전화번호 없게 하는거
					boolean phoneCheck = checkPhone(phoneNo);
					if (phoneCheck) {
						System.out.println("기존에 존재하는 전화번호입니다. 재입력 바랍니다.");
						flag = false;
						break;

					} else {
						friends[i].setPhoneNo(phoneNo);
						System.out.println("수정 : 정상 처리되었습니다.");
						flag = false;
						break;
					}

				} else {
					flag = true;
				}
			} else {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("수정 : 기존에 존재하지 않는 친구입니다.");
		}
	}
	
	public boolean checkPhone(String phoneNo) {
		boolean phoneCheck = false;
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (friends[i].getPhoneNo().equals(phoneNo)) {
					phoneCheck = true; // 기존에 존재하는 전화번호
				}
			}
		}
		return phoneCheck;
	}
	
	public void addFriend() { //친구 추가
		System.out.print("추가할 친구의 이름을 입력해주세요. >>> ");
		String name = scn.next();
		System.out.print("생일을 입력해주세요. >>> ");
		String birthday = scn.next();
		System.out.print("전화번호를 입력해주세요. >>> ");
		String phoneNo = scn.next();
		Exam4 friend = new Exam4(name, birthday, phoneNo);

		// 중복 전화번호 없게 하는
		boolean phoneCheck = checkPhone(phoneNo);
		if (phoneCheck) {
			System.out.println("기존에 존재하는 전화번호입니다. 재입력 바랍니다.");
		} else {
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					System.out.println("추가 : 정상 처리되었습니다.");
					break;
				}
			}
		}
	}
	
	
	

}
