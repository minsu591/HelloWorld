package co.edu.loop;

public class ForExample2 {
	public static void main(String[] args) {
		
		// 1~100까지 반복
		// 31번째 종료
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i == 31) {
				//break : 반복문 블럭을 빠져나온다
				break; 
			}
			if(i%2==0) {
				//continue : 이 아래로는 실행하지 않고 반복문 처음으로 돌아감
				//홀수일 경우에는 더하고 짝수인 경우에는 콘솔에 출력	
				System.out.println("현재 i의 값 => "+i);
				continue;
			}
			sum += i;
		}
		System.out.println("sum => " + sum);
		

	}
}
