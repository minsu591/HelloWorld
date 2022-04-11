package co.edu.variable;

public class VarExample2 {
	public static void main(String[] args) {
		//국어 : 80, 영어 : 70, 수학 : 63
		//국어 85, 영어 75, 수학 60
		int korScore = 85;
		int engScore = 75;
		int mathScore = 60;
		
		//평균 변수 선언
		int avg = (korScore + engScore + mathScore)/3;
		double avgDouble = (korScore+engScore+mathScore)/3.0;
		
		//출력
		System.out.println(korScore +"점, "+engScore +"점, "+mathScore+"점의 평균은 "+avg+"점 입니다.");
		System.out.println(korScore +"점, "+engScore +"점, "+mathScore+"점의 평균은 "+avgDouble+"점 입니다.");
	}
}
