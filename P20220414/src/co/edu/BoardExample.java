package co.edu;

public class BoardExample {
	//static instance member
	public static void main(String[] args) {
		//정적 멤버
		Board.writeDate = 12;
		int result = sum(1,2);
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public int sum2(int a,int b) {
		int result = sum(1,2);
		Math.random();
		return a/b;
	}
	

}
