package co.edu.api;

import java.util.ArrayList;

class Friend{
	private String name;
	private int age;
	
	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if(obj instanceof Friend) {
			Friend f = (Friend) obj;
			if(this.name.equals(f.name) && this.age==f.age) //name과 age가 같을 때 true출력
				return true;
		}
		return false;
	}
}

public class Practice {
	public static void main(String[] args) {
//		//배열로 확인
//		Friend[] friends = new Friend[10];
//		Friend friend = new Friend("홍길동",10);
//		friends[5] = new Friend("홍길동",10);
//		
//		for(Friend f : friends) {
//			if(f!=null){
//				if(f.equals(friend)) {
//					System.out.println("true");
//				}else {
//					System.out.println("false");
//				}
//			}
//		}
		
		//ArrayList확인
		ArrayList<Friend> friends2 = new ArrayList<>();
		friends2.add(new Friend("홍길동",10));
		Friend ff = new Friend("홍길동",10);
		
		if(friends2.indexOf(ff)!=-1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
	}

}
