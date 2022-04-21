package co.edu.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("java.lang.String"); //Class cls에 클래스 정보를 담아서
			Method[] methods = cls.getDeclaredMethods(); //method를 가져옴
			for(Method method : methods) {
				System.out.println(method.getName()); //메소드 이름 탐색
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//이렇게로도 클래스 가져올 수 있음
		Class obj = ObjectExample.class;
		Constructor[] cs = obj.getDeclaredConstructors();
		for(Constructor construct : cs) {
			System.out.println(construct.getName()); //메소드 이름 탐색
		}
	}
}
