package co.edu;

public class Member {
	//필드
	//회원 아이디, 회원 이름, 회원 연락처, 회원 나이
	private String memberId; //외부에서 이 항목에 접근 못하도록 하겠다.
	private String memberName;
	private String memberPhone;
	private int memberAge; //-값이 들어가면 안됨 -> 외부에서 수정할 수 없도록 -> 생성자나 메소드를 통해 수정해야함
	//생성자
	public Member(String memberId, String memberName, String memberPhone, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}
	
	//메소드
	
	
	void setMemberId(String memberId) {
		this.memberId = memberId; 
	}
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	String getMemberId() {
		return memberId;
	}
	
	int getMemberAge() {
		return memberAge;
	}
	void setMemberAge(int age) {
		if(age > 0) {
			memberAge = age;
		}else {
			memberAge = 10; //기본값인 10살 지정
		}
	}
	void showInfo() {
		System.out.printf("회원 이름 : %4s \n회원 연락처 : %13s\n회원 나이 : %4d\n",memberName, memberPhone, memberAge);
	}
}
