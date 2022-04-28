package co.edu.statics;

//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)
	private String name;
	private String birthday;
	private String phoneNo;
	
	public Exam4(String name, String birthday, String phoneNo) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void getInfo() {
		System.out.printf("%3s %6s %11s\n",name,birthday,phoneNo);
	}
}
