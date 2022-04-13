package co.edu.array;

public class Diamond {

	public static void main(String[] args) {
		// 별로 다이아몬드 만들기
		int star = 15; // 다이아몬드 줄 (반틈)
		System.out.println("start");
		for (int i = 0; i < star; i++) {
			for (int j = (star - i); j > 0; j--) {
				System.out.printf(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for (int i = 1; i < star; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = (star * 2+1)-(i*2)-2; k > 0; k--) { //가장 많은 별의 숫자 - 줄마다 별이 줄어드는 갯수 - 가득찬 윗줄 제외)
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
