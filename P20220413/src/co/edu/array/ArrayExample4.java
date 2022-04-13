package co.edu.array;

public class ArrayExample4 {
	public static void main(String[] args) {
		// int형 1~30범위의 임의의 값
		// 1. 반복문 활용. 임의의 값 5개 저장
		// 2. 15보다 큰 값만 합계 => 평균
		int[] intAry = new int[5];
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (int) (Math.random() * 30 + 1);
			System.out.println(intAry[i]);
			if (intAry[i] > 15) {
				sum += intAry[i];
				cnt++;
			}
		}
		avg = 1.0 * sum / cnt;
		System.out.println("합계 : " + sum + ", 평균 : " + avg);

	}

}
