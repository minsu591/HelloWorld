package co.edu.abstracts;

public abstract class Animal {
// Animal() 생성자로 인스턴스 생성할 수 없게한다.
	
	public Animal() {
		
	}
	//abstract : 강제로 eat() 메소드를 구현하게함.
	public abstract void eat();
	public abstract void run();
	
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}
	
}