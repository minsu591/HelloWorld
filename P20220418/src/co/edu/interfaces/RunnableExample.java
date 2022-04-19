package co.edu.interfaces;

//interface의 구현 클래스를 만들었음
//구현 클래스명
interface Runnable {
	public void run();
}

class RunClass implements Runnable{

	@Override
	public void run() {
		System.out.println("움직입니다!");
	}
}

public class RunnableExample{
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();
		
		//익명의 구현 객체를 만들겠다. (구현 클래스를 만들지 않고)
		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("멍멍이가 움직입니다!");
			}
		};
		runnable.run();
		
		//간단하게
		runnable = () -> {
			System.out.println("야옹이가 달립니다!");
		};
		runnable.run();
		
		//실행할게 하나밖에 없으면
		runnable = () -> System.out.println("병아리가 움직입니다!");
		runnable.run();
	}
}
