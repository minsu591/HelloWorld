package co.edu.statics;

import java.util.Scanner;

import co.edu.statics.FriendList;
// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
// 수정 : 사용자 이름에 해당되는 연락처를 변경하는 기능 -> 하나만 가져오기
// -> 똑같은 이름 있으면 다 띄우고 선택해서 지우기
// 삭제 : 이름으로 찾아와서 연락처 자체를 지움 null

public class Ex {
	FriendList friends = new FriendList();
	Scanner scn = new Scanner(System.in);
	
	
	public void main(String[] args) {
		int size = 10;
		friends.init(size);
		while (true) {
			System.out.println("1.추가 | 2.수정(이름, 연락처) | 3.삭제(이름) | 4.조회(이름) | 5.종료");
			System.out.print("선택 >>> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				friends.addFriend();
			} else if (menu == 2) {
				friends.modifyFriend();

			} else if (menu == 3) { // 삭제
				friends.deleteFriend();

			} else if (menu == 4) { // 조회
				friends.searchFriend();

			} else if (menu == 5) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
			}
		}
		System.out.println("end of prog.");
	}
}
