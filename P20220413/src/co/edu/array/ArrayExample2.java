package co.edu.array;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 40, 50 };

		// 배열 내의 값 순차적으로 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}

		// 배열 내에 가장 큰 수를 가져오기
		int maxVal = 0;
		for (int i = 0; i < 5; i++) {
			if (maxVal < intAry[i]) {
				maxVal = intAry[i];
			}
		}
		System.out.println("최대값 : " + maxVal);

		// 배열 내 값들의 합 구하기
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += intAry[i];
		}
		System.out.println("합 : "+sum);
		
	}
}
