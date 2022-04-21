package co.edu.friend;

import java.util.Scanner;

//친구의 주소록을 관리하는 클래스 : 이름, 연락처

public class Friend {
	Scanner scn = new Scanner(System.in);
	// 필드는 private으로 숨겨주기
	private String name;
	private String phone;
	private Gender gender; //MEN, WOMEN ->밖에 못 옴
	
	//기본 생성자 (protected)
	protected Friend() {
		
	}
	
	// 생성자
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public Friend(String name, String phone, Gender gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}


	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", gender=" + gender + "]";
	}

	public Friend addFriend() {
		System.out.print("친구의 이름을 입력해주세요 >>> ");
		String name = scn.next();
		System.out.print("친구의 전화번호를 입력해주세요 >>> ");
		String phone = scn.next();
		Friend newFriend = new Friend(name, phone);
		return newFriend;
	}

	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	@Override
    public boolean equals(Object obj) {
    	if(obj instanceof Friend) {
    		Friend val = (Friend) obj; //들어온 Object를 해당 클래스로 캐스팅하고
    		if(this.name.equals(val.name)&&this.phone.equals(val.phone)&&this.gender.equals(val.gender)) {
    			return true;
    		}else {
    			return false;
    		}
    	}else {
    		return false;
    	}
    }

}
