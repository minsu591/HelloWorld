package co.edu.variable;

public class VarExample4 {
	public static void main(String[] args) {
		//영어 80, 수학 70, 영어 > 수학
		int engScore =80;
		int mathScore =70;
		boolean engMath = engScore > mathScore;
		System.out.println(engMath);
		if(engMath) {
			System.out.println("영어점수가 수학점수보다 큽니다.");
		}
	}
}
