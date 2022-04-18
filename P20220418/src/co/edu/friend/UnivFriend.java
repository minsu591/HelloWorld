package co.edu.friend;

import java.util.Scanner;

//학교 친구 : 학교 이름, 전공 과목
public class UnivFriend extends Friend {

	private String univ;
	private String major;

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone); // 부모 클래스 생성자 호출, 위치는 제일 첫 줄
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [name=" + this.getName() + ", phone=" + this.getPhone() + ", univ=" + univ + ", major="
				+ major + "]";
	}

	@Override
	public UnivFriend addFriend() {
		Friend newFriend = super.addFriend();
		System.out.print("친구의 학교를 입력해주세요 >>> ");
		String univ = scn.next();
		System.out.print("친구의 전공을 입력해주세요 >>> ");
		String major = scn.next();
		UnivFriend newUniv = new UnivFriend(newFriend.getName(), newFriend.getPhone(), univ, major);
		return newUniv;
	}

}
