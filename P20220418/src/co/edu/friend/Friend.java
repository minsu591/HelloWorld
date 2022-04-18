package co.edu.friend;

import java.util.Scanner;

//친구의 주소록을 관리하는 클래스 : 이름, 연락처

public class Friend {
	Scanner scn = new Scanner(System.in);
	// 필드는 private으로 숨겨주기
	private String name;
	private String phone;
	
	//기본 생성자 (protected)
	protected Friend() {
		
	}
	
	// 생성자
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	// 메소드
	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	
	public Friend addFriend() {
		System.out.print("친구의 이름을 입력해주세요 >>> ");
		String name = scn.next();
		System.out.print("친구의 전화번호를 입력해주세요 >>> ");
		String phone = scn.next();
		Friend newFriend = new Friend(name, phone);
		return newFriend;
	}

}
