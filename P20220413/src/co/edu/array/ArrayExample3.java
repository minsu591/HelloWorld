package co.edu.array;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[] intAry = { 78, 83, 88, 92, 63 };

		// 각 배열 요소들의 합을 구하시오 (sum)
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += intAry[i];
		}
		System.out.println("합 : " + sum);

		// double avg 평균값
		double avg = 0;
		avg = sum / 5.0; //*double형 변수 구할 때 int / double
		System.out.println("평균 : " + avg);

		// 1,3,5번째 값만 합과 평균 구하기 (if 사용)
		System.out.println("\n[1, 3, 5번째 값의 합과 평균]");
		sum = 0;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				sum += intAry[i];
			}
		}
		avg = sum / 3.0;
		System.out.println("합 : " + sum + ", 평균 : " + avg);

		// 짝수인 값만 합과 평균 구하기
		System.out.println("\n[짝수인 값들의 합과 평균]");
		int cnt = 0;
		sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] % 2 == 0) {
				sum += intAry[i];
				cnt++;
			}
		}
		avg = 1.0 * sum / cnt;
		System.out.println("합 : " + sum + ", 평균 : " + avg);
		
		

	}
}
