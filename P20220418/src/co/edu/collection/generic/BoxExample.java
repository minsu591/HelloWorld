package co.edu.collection.generic;

import java.util.ArrayList;

import co.edu.friend.Friend;

class Orange{
	
}

public class BoxExample {
	public static void main(String[] args) {
		//박스의 필드와 메소드의 리턴값을 Object로 설정
		Box box = new Box();
		box.setField("Orange");
		String result =(String) box.getField(); //String = (String) Object
		
		//앞에서 String형의 값을 담아놨는데, Orange형의 값을 다시 담으려고 해서 오류가 남 => generic 필요
//		Orange orange = (Orange) box.getField(); //Object -> Orange
		System.out.println("end of prog");
		
		//String으로 설정
		Box<String> boxes = new Box<String>();
		boxes.setField("hi"); //=> 위에서 string 타입으로 제너릭 설정을 했기 때문에 String만 넣을 수 있음
		
		//Integet로 설정
		Box<Integer> box2 = new Box<>();
		box2.setField(10);
		int result2 = box2.getField();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
//		list.add(10); // 에러
		list.add("김길동");
		
		ArrayList<Friend> friendList = new ArrayList<Friend>();
		friendList.add(new Friend("박길동","123-834-234"));
		
	}

}
