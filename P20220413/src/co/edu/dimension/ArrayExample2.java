package co.edu.dimension;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 학급 1반 ~ 3반
		// 각 반의 학생수가 다름 [1반 : 3명, 2반 : 4명, 3반 : 2명]의 점수

		int[][] scores = { { 59, 63, 72 }, { 56, 77, 33, 24 }, { 55, 76 } };
		
		//각 반의 합계와 평균 구하기
		double avg = 0;
		for(int i = 0; i<scores.length;i++) {
			int sum = 0;
			for(int j = 0; j<scores[i].length;j++) {
				sum += scores[i][j];
			}
			avg = 1.0 * sum / scores[i].length;
			
			System.out.println(i+1+"반의 합 : "+sum+", 평균 : "+avg);
		}
		

	}

}
