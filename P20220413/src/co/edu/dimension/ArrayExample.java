package co.edu.dimension;

public class ArrayExample {
	public static void main(String[] args) {
		int[][] intAry = new int[4][3];
		intAry[0][0] = 10;
		intAry[1][0]=20;
		intAry[3][2]=100;
		
		for(int j = 0; j<intAry.length;j++) {
			for(int i = 0; i<intAry[3].length;i++) {
				System.out.print("["+j+"] ["+i+"] => "+intAry[j][i]+"  ");
			}
			System.out.println();
		}
			
	}
}
