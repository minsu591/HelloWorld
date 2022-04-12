package co.edu;

public class BitOperatorExample {
	public static void main(String[] args) {
		int num = 8; //이진수 1000;
		int result = num << 2; // 비트연산, 왼쪽으로 두 번 이동하겠다. 비어있는 공간은 0으로 채운다.
		System.out.println(result);
		int result2 = num >> 2; 
		System.out.println(result2);
	}
}
