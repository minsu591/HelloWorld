package co.edu.collection;

import co.edu.friend.Friend;

public interface FriendService {
	//추가, 수정(이름), 삭제(이름), 조회
	//이름이 유일하다 가정하고
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend findFriend(String name); //이름 넣으면 한 건 조회
	public void allsearchFriend();
}
