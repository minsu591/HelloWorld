package co.edu;

import co.edu.statics.Singleton;

public class SingletonEx {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		//접근 수준이 default이므로 여기서 사용 불가
//		Car car;
	}
}
