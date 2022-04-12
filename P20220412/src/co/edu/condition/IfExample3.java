package co.edu.condition;

public class IfExample3 {

	public static void main(String[] args) {
		//중첩 구문
		// 90점 이상이면 A학점, 80점 이상이면 B학점, 70점 이상이면 C학점
		int score = 99;
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점");				
			}
		}else if(score >= 80) {
			if(score>=85) {
				System.out.println("B+학점");
			}else {
				System.out.println("B학점");				
			}
		}else if(score >= 70) {
			if(score >= 75) {
				System.out.println("C+학점");
			}else {
				System.out.println("C학점");				
			}
		}else {
			System.out.println("F학점");
		}
		
		

	}

}
