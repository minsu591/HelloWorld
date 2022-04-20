package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;
//배열의 기능 활용
public class FriendServiceArray implements FriendService{
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];
	
	@Override
	public void addFriend(Friend friend) {
		for(int i =0;i<friends.length;i++) {
			if(friends[i]==null) {
				friends[i]=friend;
				System.out.println("추가가 완료되었습니다.");
				break;
			}
		}
	}

	@Override
	public void modFriend(Friend friend) { //이름으로 찾아서 연락처 수정
		for(int i = 0; i<friends.length;i++) {
			if(friends[i]!=null && friends[i].getName().equals(friend.getName())&& friends[i].getPhone().equals(friend.getPhone())) {
				System.out.println(friend.getName()+"의 연락처를 수정합니다.");
				System.out.print("수정할 연락처를 입력해주세요 >>> ");
				String newPhone = scn.next();
				friends[i].setPhone(newPhone);
				System.out.println("연락처 업데이트가 완료되었습니다.");
				break;
			}
		}
		
	}

	@Override
	public void remFriend(String name) {
		for(int i = 0;i<friends.length;i++) {
			if(friends[i]!=null && friends[i].getName().equals(name)) {
				System.out.print("정말로 삭제하시겠습니까? (Y/N) >>> ");
				String ans = scn.next();
				if(ans.equalsIgnoreCase("y")) {
					friends[i]=null;
					System.out.println("삭제가 완료되었습니다.");
					break;
				}
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		Friend findFr = null;
		for(int i =0;i<friends.length;i++) {
			if(friends[i]!=null && friends[i].getName().equals(name)) {
				findFr = friends[i];
				break;
			}
		}
		return findFr;
	}

	@Override
	public void allsearchFriend() {
		for(int i = 0; i<friends.length;i++) {
			if(friends[i] !=null) {
				System.out.println(friends[i].toString());
				
			}
		}
		
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void returnGender() {
		// TODO Auto-generated method stub
		
	}

}
