package co.edu.condition;

public class IfExample {
	public static void main(String[] args) {
		// 점수별로 성적 나누기
		// 90점보다 크면 A, 80점보다 크면 B, 70점보다 크면 C, 나머지는 F
		int score = 95;

		// 조건이 많은 1개의 if구문 이 중 하나만 실행, if - else if - else
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}

		// if구문이 4개, 전부 실행
		if (score >= 90) {
			System.out.println("A학점");
		}
		if (score >= 80) {
			System.out.println("B학점");
		}
		if (score >= 70) {
			System.out.println("C학점");
		}
		if (score < 70) {
			System.out.println("F학점");
		}

	}

}
