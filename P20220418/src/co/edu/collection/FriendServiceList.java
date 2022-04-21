package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//컬렉션 ArrayList 기능 활용
public class FriendServiceList implements FriendService {
	Scanner scn = new Scanner(System.in);
	ArrayList<Friend> friends = new ArrayList<>();

	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
		System.out.println("추가가 완료되었습니다.");
	}

	@Override
	public void modFriend(Friend friend) {
		
		//이름, 연락처 받아 -> 이름 수정
//		for(int i=0; i<friends.size(); i++) {
//			Friend findFriend = (Friend) friends.get(i);
//	         if(findFriend.getName().equals(friend.getName())) {
//	        	System.out.println("새로운 이름 >>> ");
//	        	String newName = scn.next();
//	            findFriend.setName(newName);
//	            break;
//	         }
//		}
		
//		//이름, 연락처를 받아 -> 연락처 수정
//		for (int i = 0; i < friends.size(); i++) {
//			Friend modfriend = friends.get(i);
//			if (modfriend.getName().equals(friend.getName())) {
//				System.out.println(friend.getName() + "의 연락처를 수정합니다.");
//				System.out.print("수정할 연락처를 입력해주세요 >>> ");
//				String newPhone = scn.next();
//				modfriend.setPhone(newPhone);
//				System.out.println("연락처 업데이트가 완료되었습니다.");
//				break;
//			}
//		}
		
		
//		.indexOf 사용 -> 클래스 자체의 equals를 오버라이딩해야됨
//		System.out.println(friend.toString());
		int whereIndex = friends.indexOf(friend);
//		System.out.println(whereIndex);
		
		if(whereIndex == -1) {
			System.out.println("존재하지 않는 친구입니다.");
		}else {
			System.out.println(friend.getName()+"의 연락처를 수정합니다.");
			System.out.println("수정할 연락처를 입력해주세요 >>> ");
			friends.get(whereIndex).setPhone(scn.next());
			System.out.println("연락처 업데이트가 완료되었습니다.");
		}
	}

	@Override
	public void remFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			Friend newFriend = friends.get(i);
			if (newFriend.getName().equals(name)) {
				System.out.print("정말로 삭제하시겠습니까? (Y/N) >>> ");
				String ans = scn.next();
				if (ans.equalsIgnoreCase("y")) {
					friends.remove(i);
					System.out.println("삭제가 완료되었습니다.");
					i--;
				}
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		Friend findName = null;
		for (int i = 0; i < friends.size(); i++) {
			Friend newFriend = friends.get(i);
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
			Friend f = friends.get(i);
			System.out.println(f.toString());
		}
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<>();
		for(int i =0; i<friends.size();i++) {
			Friend f = friends.get(i);
			if(gender == f.getGender()) {
				//열거형타입 클래스타입 같은 참조타입
				//
				list.add(f);
			}
		}
		
		return list;
	}
	
	@Override
	public void returnGender() { //다른 방법으로 gender리턴
		for(int i = 0; i<friends.size();i++) {
			for(Gender g : Gender.values()) {
				if(g==friends.get(i).getGender()) {
					System.out.println(friends.get(i).toString());
				}
			}
		}
	}

}
