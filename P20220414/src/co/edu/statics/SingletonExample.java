package co.edu.statics;

class Car{
	
}
public class SingletonExample {
	public static void main(String[] args) {
		//접근 불가
//		Singleton sg = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2) { //same -> 같은 주소를 참조하고 있다.
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}
}
