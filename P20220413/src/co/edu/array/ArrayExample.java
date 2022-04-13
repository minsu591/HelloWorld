package co.edu.array;

public class ArrayExample {
	public static void main(String[] args) {
		// 30명 학생의 점수를 저장하고 싶음
		int score1 = 90;
		// ...
		int score30 = 86;

		// 여러개의 같은 유형의 값을 저장
		// 참조 타입이라 new 키워드로 만듦
		int[] intArr = new int[30]; // 정수 int 30개 담을 공간
		intArr[0] = 30;
		intArr[4] = 40;
		intArr[29] = 55;
		// ArrayIndexOutOfBoundsException
		// intArr[30] =55;

		System.out.println(intArr[0]); // 30
		System.out.println(intArr[1]); // 0 -> 정수형 배열은 기본값이 0 / 실수형 배열은 기본값이 0.0
		double[] dblArr = new double[10]; // double 저장 10개를 선언

		String[] strArr = new String[5]; // String 배열의 기본 참조변수 : null
		System.out.println(strArr[0]); // null

		int[] otherArr = { 10, 20, 30, 40 }; // 처음부터 기본값 설정하고 싶으면 {}를 통해 설정
		int[] theOtherArr = { 10, 20, 30, 40 };
		System.out.println(otherArr[0]);
		
		//배열은 참조변수이기 때문에 주소값으로 비교하게 됨 -> 같은 값이 들어있어도 다르다
		if(otherArr == theOtherArr) { //diff
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
		
		if(otherArr[0] == theOtherArr[0]) { //same
			System.out.println("same");
		}else {
			System.out.println("diff");
		}

	}

}
