package co.edu.friend;

//회사 친구 : 회사 이름, 부서
public class ComFriend extends Friend {
	private String company;
	private String department;
	
	public ComFriend() {
		super();
	}
	
	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

	
	@Override
	public String toString() {
		return " ComFriend [name=" + this.getName() + ", phone=" + this.getPhone() +", company= " + company + ", department=" + department + "]";
	}
	
	@Override
	public ComFriend addFriend() {
		Friend newFriend = super.addFriend();
		System.out.print("친구의 회사를 입력해주세요 >>> ");
		String com = scn.next();
		System.out.print("친구의 부서를 입력해주세요 >>> ");
		String depart = scn.next();
		ComFriend newCom = new ComFriend(newFriend.getName(),newFriend.getPhone(),com,depart);
		return newCom;
	}

}
