package co.edu.api;

import java.util.HashSet;

class Member{
	String name;
	int age;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() { //문자열이 가지고 있는 hashcode -> 값이 같으면 동일하게 나온다
//		return super.hashCode();
		return this.age; //나이가 같은 것끼리 return하게
	}
	
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return this.name.equals(member.name); //내 name이 비교대상으로 들어온 name과 같은지
		}
		return true;
	}

	@Override
	public String toString() {
		return "이름은 " + name + "이고 나이는 " + age + "살입니다.";
	}
	
	
}
public class ObjectExample {
	public static void main(String[] args) {
		//ArrayList : 인덱스를 통해 요소를 구분 -> 똑같은 값이 들어가도 인덱스 값을 통해 구분O
		//Set (집합) -> 인덱스로 값 구분X, 요소 값으로 구분, 중복된 값은 제외함
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(300);
		set.add(100);
		set.add(200);
		System.out.println(set.size()); //3, 중복값 제외하기 때문
		
		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동",20));
		members.add(new Member("김길동",22));
		members.add(new Member("박길동", 25));
		members.add(new Member("홍길동",20));
		System.out.println(members.size());
		System.out.println(new Member("홍길동",20).toString()); //co.edu.api.Member@14 => Override를 안했기 때문에 부모클래스가 가진 값이 출력됨
		
	}
}
