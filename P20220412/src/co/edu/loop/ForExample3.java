package co.edu.loop;

public class ForExample3 {
	public static void main(String[] args) {
		// 1 ~ 100번 반복 더하기
		// sum의 값이 최초로 1000보다 큰 값이 된 순간의 값과 그 순간의 i
		int sum = 0;
		int over1000Num = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum >= 1000) {
				over1000Num = i;
				break;
			}
		}
		System.out.println("1000보다 큰 최소 합계 : " + sum + ", 순번 : " + over1000Num);

		// 1~10번을 반복
		// sum = sum * 1~10
		System.out.println();
		sum = 1;
		for (int i = 1; i <= 10; i++) {
			sum *= i;
		}
		System.out.println("1에서 10까지 곱한 결과 => " + sum);
		System.out.println();

		// 숫자 100의 약수 출력
		int num = 100;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		
	}
}
