package co.edu;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService member = new MemberService();
		boolean result = member.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			member.logout("hong");
		}else {
			System.out.println("아이디 혹은 패스워드가 올바르지 않습니다.");
		}

	}

}
