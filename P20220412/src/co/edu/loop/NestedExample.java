package co.edu.loop;

public class NestedExample {

	public static void main(String[] args) {
		// 반복문 안의 반복문
		// 구구단 2~9단 작성
		for (int j = 2; j < 10; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
			System.out.println("##########");
		}

		// 별 만들기
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// 별 만들기 역순
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//     *
		//    **
		//   ***
		//  ****
		int star = 4;
		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
