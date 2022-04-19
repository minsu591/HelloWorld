package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;

//컬렉션 ArrayList 기능 활용
public class FriendServiceList implements FriendService {
	Scanner scn = new Scanner(System.in);
	ArrayList friends = new ArrayList();

	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
		System.out.println("추가가 완료되었습니다.");
	}

	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.size(); i++) {
			Friend modfriend = (Friend) friends.get(i);
			if (modfriend.getName().equals(friend.getName())) {
				System.out.println(friend.getName() + "의 연락처를 수정합니다.");
				System.out.print("수정할 연락처를 입력해주세요 >>> ");
				String newPhone = scn.next();
				friend.setPhone(newPhone); //modfriend.setPhone(newPhone);
				friends.set(i, friend);
				System.out.println("연락처 업데이트가 완료되었습니다.");
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			Friend newFriend = (Friend) friends.get(i);
			if (newFriend.getName().equals(name)) {
				System.out.print("정말로 삭제하시겠습니까? (Y/N) >>> ");
				String ans = scn.next();
				if (ans.equalsIgnoreCase("y")) {
					friends.remove(i);
					System.out.println("삭제가 완료되었습니다.");
				}
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		Friend findName = null;
		for (int i = 0; i < friends.size(); i++) {
			Friend newFriend = (Friend) friends.get(i);
			if (newFriend.getName().equals(name)) {
				findName = newFriend;
				break;
			}
		}
		return findName;
	}

	@Override
	public void allsearchFriend() {
		for (int i = 0; i < friends.size(); i++) {
			Friend f = (Friend) friends.get(i);
			System.out.println(f.toString());
		}
	}

}
