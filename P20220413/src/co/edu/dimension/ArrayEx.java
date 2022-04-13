package co.edu.dimension;

public class ArrayEx {
	public static void main(String[] args) {

		// 가로로
		int[][] numbers = new int[5][5];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = i * numbers[i].length + j + 1; // 열 숫자만큼
				System.out.printf("%3d", numbers[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		// 세로로 (각 값들은 순서대로 저장되어있고 값을 출력하는 방식만 변경
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%3d", numbers[j][i]);
			}
			System.out.println();
		}

//		// 거꾸로 올라가기
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = numbers[i].length; j > 0; j++) {
//				System.out.printf("%3d", numbers[i][j]);
//			}
//		}

	}

}
