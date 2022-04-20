package co.edu.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
	ArrayList<User> users = new ArrayList<>();
	Scanner scn = new Scanner(System.in);
	
	public User returnAccount(int no) {
		User user = users.get(no);
		return user;
	}
	
	public void createAccount() {
		System.out.println("[회원가입을 진행합니다]");
		System.out.print("이름을 입력해주세요 >>> ");
		String name = scn.next();
		System.out.print("가입할 id를 입력해주세요 >>> ");
		String id = scn.next();
		boolean flag = true;
		for(int i =0;i<users.size();i++) {
			if(users.get(i).getId().equals(id)) {
				System.out.println("동일한 id가 있습니다. 다시 진행해주세요.");
				flag =false;
				break;
			}
		}
		if(flag) {
			System.out.print("가입할 password를 입력해주세요 >>> ");
			String passwd = scn.next();
			User newUser = new User(id,passwd,name);
			users.add(newUser);
			System.out.println("회원가입을 축하합니다.");
		}
	}
	
	public int login() {
		System.out.print("id >>> ");
		String id = scn.next();
		for(int i = 0; i<users.size();i++) {
			if(users.get(i).getId().equals(id)) {
				System.out.print("password >>> ");
				String passwd = scn.next();
				if(users.get(i).getPasswd().equals(passwd)) {
					System.out.println(users.get(i).getName()+"님이 로그인되었습니다.");
					return i;
				}
			}
		}
		return -1;
		
		
	}

}
