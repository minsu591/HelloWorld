package co.edu.api;

public class SystemExample {
	public static void main(String[] args) {
		System.out.println("start");
		
		long time = System.nanoTime();
		long sum = 0;
		for(int i = 0; i<1000000;i++) {
			sum+=i;
		}
		long end = System.nanoTime();
		System.out.println(end-time);
		
		System.exit(0); //프로그램 실행하다가 종료할 때
		System.out.println("end");
		
	}

}
