package co.edu;

public class CalExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		c1.printPI();
		c1.getArea(2.4);
		int result = c1.sum(30, 20);
		System.out.println("두 수의 합 : " + result);
		double result1 = c1.sum(30.2, 30);
		System.out.println(result1);

		double result2 = c1.getTriangleArea(24, 22.2);
		System.out.println("삼각형의 넓이는 " + result2 + "입니다.");

		int[] ary = {10,20,30,40};
		result = c1.sum(ary);
		System.out.println("배열의 합 : " + result);
		
		double result3 = c1.average(10, 20, 30, 40);
		System.out.println("배열의 평균 : " + result3);
		
		double result4 = c1.average(1,23,4,5,8,9,3);
		System.out.println(result4);
	}

}
