package co.edu.statics;

import java.util.Scanner;

import co.test.statics.Exam4;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
// 수정 : 사용자 이름에 해당되는 연락처를 변경하는 기능 -> 하나만 가져오기
// -> 똑같은 이름 있으면 다 띄우고 선택해서 지우기
// 삭제 : 이름으로 찾아와서 연락처 자체를 지움 null

public class Exex {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Exam4[] friends = new Exam4[10];

		while (true) {
			System.out.println("1.추가 | 2.수정(이름, 연락처) | 3.삭제(이름) | 4.조회(이름) | 5.종료");
			System.out.print("선택 >>> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.print("추가할 친구의 이름을 입력해주세요. >>> ");
				String name = scn.next();
				System.out.print("생일을 입력해주세요. >>> ");
				String birthday = scn.next();
				System.out.print("전화번호를 입력해주세요. >>> ");
				String phoneNo = scn.next();
				Exam4 friend = new Exam4(name, birthday, phoneNo);

				// 중복 전화번호 없게 하는
				boolean phoneCheck = false;
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						if (friends[i].getPhoneNo().equals(phoneNo)) {
							phoneCheck = true; // 기존에 존재하는 전화번호
						}
					}
				}

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

			} else if (menu == 2) {
				int[] saveNum = new int[10];
				//초기화
				for(int save : saveNum) {
					save = -1;
				}
				
				System.out.print("수정할 친구의 이름을 입력해주세요. >>> ");
				String name = scn.next();
				
				//saveNum에 같은 이름 가진 사람들의 인덱스 삽입
				for(int i = 0; i<friends.length;i++) {
					if(friends[i]!=null && friends[i].getName().equals(name)) {
						for(int save : saveNum) {
							if()
							if(save==-1) {
								save = i;
								break;
							}
						}
					}
				}
				
				//해당 인덱스 사람들 프린트
				for(int i = 0; i<saveNum.length;i++) {
					int save = saveNum[i];
					if(save != -1 && friends[save]!=null) {
						System.out.println(i);
						friends[save].getInfo();
					}
				}
				
				System.out.println("수정할 정보를 선택하세요 >>> ");
				int sel = scn.nextInt();
				int saveNo = saveNum[sel];
				if(saveNo != -1 && friends[saveNo]!=null) {
					System.out.print("수정할 전화번호를 입력하세요 >>> ");
					String phoneNo = scn.next();
					friends[saveNo].setPhoneNo(phoneNo);
					System.out.println("완료되었습니다.");
				}

			} else if (menu == 3) { // 삭제
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

			} else if (menu == 4) { // 조회
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
