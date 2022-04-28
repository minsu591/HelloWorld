package co.edu;

public class MemberService {
	//Field
	private String id;
	private String password;
	
	//생성자 
	public MemberService() {
		
	}
	
	//Method
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	void logout(String id) {
		System.out.println(id+" 아이디가 로그아웃 되었습니다.");
	}

}
