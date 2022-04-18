package co.edu.abstracts;

public class Main {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //X -> 이렇게 선언 불가 (Animal 생성자로 instance 생성 불가)
		Animal animal = null;
		animal = new Bird();
		animal.eat();
		animal.run();
		animal.sleep();
		
		animal = new Fish();
		animal.eat();
		animal.run();
		animal.sleep();
		
		
	}
}
