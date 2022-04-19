package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;

//배열 vs 컬렉션
//배열 활용한 프로그램, 컬렉션을 활용한 프로그램
//인터페이스 선언 => 구현하는 클래스
public class ArrayExample {
	public static void main(String[] args) {
		// 배열 : 크기 변경 불가 vs 컬렉션 : 크기 고정할 필요 X, null 처리 필요X
		// 배열
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("홍길동","010-2343-3434");
		friendAry[1] = new Friend("김길동","010-2677-0987");
		friendAry[0] = null; //삭제할 때 null 넣으면 됨
		//배열의 null처리
		for(int i = 0; i<friendAry.length;i++) {
			if(friendAry[i]!=null) {
				System.out.println(friendAry[i].toString());				
			}
		}
		//배열 범위 초과해서 값을 넣을 수 없음
		
		//컬렉션
		//List -> 인터페이스(컬렉션), ArrayList -> 클래스
		ArrayList friendList = new ArrayList();
		friendList.add(new Friend("박길동","010-2343-3567")); //추가
		friendList.add(new Friend("최길동","010-1111-2222"));
		friendList.remove(0); //인덱스로 삭제
		
		for(int i = 0; i<friendList.size();i++) {
			System.out.println(friendList.get(i));
		}
		System.out.println(friendList.isEmpty()); //값 유무 확인
		
		//get(인덱스) => Object
		Friend f2 = (Friend) friendList.get(0); //return type이 Object로, Friend로 캐스팅을 해줘야함.
		
		
		
	}
}
