package co.edu.dimension;

public class Exercise05 {
	public static void main(String[] args) {
		int[][] arr = {{95,86},{83,92,96},{78,83,93,87,88}};
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		for(int i =0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				sum+= arr[i][j];
				cnt ++;
			}
		}
		avg = 1.0 * sum /cnt;
		System.out.println("합계 : "+sum + ", 평균 : "+avg);
	}

}
