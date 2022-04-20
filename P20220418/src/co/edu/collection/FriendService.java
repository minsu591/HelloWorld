package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

public interface FriendService {
	public static int ADD=1;
	public static int MOD=2;
	public static int REM =3;
	public static int SEARCH=4;
	public static int SEARCHALL=5;
	public static int FIND_MEN=6;
	public static int FIND_WOMEN=7;
	
	//추가, 수정(이름), 삭제(이름), 조회
	//이름이 유일하다 가정하고
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
	public void remFriend(String name);
	public Friend findFriend(String name); //이름 넣으면 한 건 조회
	public void allsearchFriend();
	public ArrayList<Friend> findGender(Gender gender);
	//연습
	public void returnGender();
	
	
}
