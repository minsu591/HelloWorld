package co.edu.loop;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			// i = 초기값, 조건만족, 반복문 돎
			sum = sum + 3;
			// i++
		}
		System.out.println("sum = " + sum);

		System.out.println("구구단 3단");
		for (int i = 1; i < 10; i++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}

		System.out.println("\n구구단 3단 거꾸로");
		for (int i = 9; i > 0; i--) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}

		System.out.println("\n구구단 5단\n");
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}

		//1. for 반복문 이용해서 sum에 1,2,3,4,5 순서대로 더하기
		sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println("sum => " + sum);
		
		//2. for 반복문 이용해서 sum에 1,3,5,7,9 순서대로 더하기
		sum = 0;
		for (int i = 1; i<=9; i+=2) {
			sum =sum + i;
		}
		System.out.println("sum => " + sum);

		//3. 2,4,6,8,10씩 증가해서 더하기
		sum = 0;
		for (int i = 2; i<=10; i+=2) {
			sum = sum+i;
		}
		System.out.println("sum =>"+sum);
		
		//4.
		sum = 0;
		for(int i = 1; i<=10; i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println("sum =>"+sum);
	}
}